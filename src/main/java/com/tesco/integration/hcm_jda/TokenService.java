/*
package com.tesco.integration.hcm_jda;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Signal;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Service
public class TokenService {

    // Cache: key = any string, value = identity token
    private final Cache<String, String> tokenCache;

    public TokenService() {
        this.tokenCache = Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(1000)
                .build();
    }


    public Mono<String> getToken(String cacheKey) {
        return CacheMono.lookup(
                        key -> Mono.justOrEmpty(tokenCache.getIfPresent(key))
                                .map(Signal::next),
                        cacheKey
                )
                .onCacheMissResume(() -> fetchTokenFromSource(cacheKey))
                .andWriteWith((key, signal) -> {
                    return Mono.fromRunnable(() -> {
                        if (signal.isOnNext() && signal.get() != null) {
                            tokenCache.put(key, signal.get());
                        } else {
                            tokenCache.invalidate(key);
                        }
                    });
                });
    }




    private Mono<String> fetchTokenFromSource(String cacheKey) {
        // Simulate a response for specific cacheKey
        if (cacheKey.contains("user123")) {
            return Mono.just("token-abc123").delayElement(Duration.ofMillis(200));
        } else {
            return Mono.empty(); // Simulates token not found or expired
        }
    }


    public Mono<Void> invalidateToken(String cacheKey) {
        return Mono.fromRunnable(() -> tokenCache.invalidate(cacheKey));
    }
}

*/
