package com.tesco.integration.hcm_jda.interview.questions.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSafeIteration {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() == 2) {
                iterator.remove();  //Iterator remove so no exception
            }
        }

        System.out.println(map);
    }
}
