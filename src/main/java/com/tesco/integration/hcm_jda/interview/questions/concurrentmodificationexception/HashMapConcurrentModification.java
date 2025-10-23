package com.tesco.integration.hcm_jda.interview.questions.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcurrentModification {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 2) {
                map.remove(2);  //Direct modification we will get
            }
        }

        System.out.println(map);
    }
}
