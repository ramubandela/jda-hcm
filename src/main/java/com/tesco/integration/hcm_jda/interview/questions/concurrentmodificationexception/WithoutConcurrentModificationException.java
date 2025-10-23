package com.tesco.integration.hcm_jda.interview.questions.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WithoutConcurrentModificationException {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==2){
                list.remove(1);
            }
        }


        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next() ==2){
                iterator.remove();//iteraror removal no ecption
            }
        }

        System.out.println(list);

        ListIterator<Integer> integerListIterator = list.listIterator();

        while(integerListIterator.hasNext()){
            if(integerListIterator.next()%2 !=0){
                integerListIterator.add(integerListIterator.next());//iteraror removal no ecption
            }
        }
        System.out.println(list);
      /*  ✅ Summary
        Scenario	Example	Exception?	Why
        Direct list.remove() in loop	list.remove(2)	❌ Throws	Bypasses iterator
        Using iterator.remove()	✅ it.remove()	✅ Safe	Keeps modCount synced
        Using ConcurrentHashMap / CopyOnWriteArrayList	✅	✅ Safe	Fail-safe iterators*/
    }
}
