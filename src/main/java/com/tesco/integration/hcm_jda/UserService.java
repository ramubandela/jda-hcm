package com.tesco.integration.hcm_jda;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UserService {
    private final WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");

    public Mono<User> getUserById(String id) {
        return webClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .bodyToMono(User.class)
                .switchIfEmpty(Mono.just(new User("0", "Not Found", 0)))
                .map(user -> {
                    user.setName(user.getName().toUpperCase());
                    return user;
                })
                .flatMap(user -> {
                    if (user.getAge() > 18) return Mono.just(user);
                    else return Mono.error(new IllegalArgumentException("User is underaged"));
                })
                .onErrorResume(e -> {
                    User fallback = new User();
                    fallback.setId("0");
                    fallback.setName("Fallback User");
                    fallback.setAge(0);
                    return Mono.just(fallback);
                });
    }

    public Mono<List<Post>> getPostsByUserId(String userId) {
        return webClient.get()
                .uri("/users/{id}/posts", userId)
                .retrieve()
                .bodyToFlux(Post.class)
                .collectList()
                .onErrorResume(e -> {
                    // Fallback: return empty list
                    System.err.println("Post fetch failed: " + e.getMessage());
                    return Mono.just(List.of());
                });
    }

    public Mono<UserProfile> getUserProfile(String userId) {
        return Mono.zip(getUserById(userId), getPostsByUserId(userId))
                .map(tuple -> {
                    UserProfile profile = new UserProfile();
                    profile.setUser(tuple.getT1());
                    profile.setPosts(tuple.getT2());
                    return profile;
                })

                .doOnSuccess(profile -> System.out.println("Successfully built user profile for: " + profile.getUser().getName()))
                .doOnError(e -> System.err.println("Error building profile: " + e.getMessage()))
                .onErrorResume(e -> {
                    // Final fallback if zip fails entirely
                    UserProfile fallback = new UserProfile();
                    fallback.setUser(new User());
                    fallback.setPosts(List.of());
                    return Mono.just(fallback);
                });
    }
}
