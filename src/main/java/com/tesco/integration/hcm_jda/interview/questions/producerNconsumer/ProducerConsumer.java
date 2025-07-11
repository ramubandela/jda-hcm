package com.tesco.integration.hcm_jda.interview.questions.producerNconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

    public static void main(String[] args) {
          Object object=new Object();

        List<Integer> list=new ArrayList<>();

        Runnable producer=()->{
    while (true) {
        synchronized (object) {
        if (!list.isEmpty()) {

            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            list.add(0);
        System.out.println("Producer added value "+0);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            object.notify();
    }
}
        };




        Runnable consumer=()->{
            while (true) {
                synchronized (object) {
                    if (list.isEmpty()) {

                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    list.remove(0);
                    System.out.println("list is consumed");
                    object.notify();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        };


        Thread t=new Thread(producer);
        t.start();
        Thread t2=new Thread(consumer);
        t2.start();
    }

}
