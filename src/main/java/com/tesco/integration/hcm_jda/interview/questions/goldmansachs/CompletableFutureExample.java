package com.tesco.integration.hcm_jda.interview.questions.goldmansachs;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    static Map<Integer, Empployee> map=new LinkedHashMap<>();
    public static void main(String[] args) {
//List.of(2,3,5,6,8,90,678)  for these ids get Employee details

        map.put(2, new Empployee(2,"raja","",25));
        map.put(3, new Empployee(3,"raj","",25));
        map.put(5, new Empployee(5,"ramu","",30));
        map.put(6, new Empployee(6,"rama","",30));
        map.put(8, new Empployee(8,"ramana","",45));
        map.put(90, new Empployee(90,"venu","",45));
        map.put(678, new Empployee(678,"veena","",90));
        map.put(9, new Empployee(2,"veen","",90));
        map.put(11, new Empployee(2,"ven","",90));

        List<Integer> integers = List.of(2, 3, 5, 6, 8, 90, 678);
        //integers.stream().map(x-> CompletableFuture.supplyAsync(getEmployee(x)))

    }


    public static Empployee getEmployee(int id){




        return map.get(id);
    }

}

class Empployee{
    public Empployee(int id, String name, String address,int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age=age;

    }

    int id;
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;
}