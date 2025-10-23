package com.tesco.integration.hcm_jda.interview.questions.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

      System.out.println(list);
          for(int i:list){
            if(i==2){
                list.remove(1);
            }
        }

        System.out.println(list);
    }
}
