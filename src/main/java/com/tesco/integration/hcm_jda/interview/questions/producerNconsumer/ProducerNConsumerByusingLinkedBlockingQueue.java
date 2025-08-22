package com.tesco.integration.hcm_jda.interview.questions.producerNconsumer;

import java.util.concurrent.LinkedBlockingQueue;

public class ProducerNConsumerByusingLinkedBlockingQueue {

    private static LinkedBlockingQueue<Integer> queue=new LinkedBlockingQueue<>();


    public static void main(String[] args) {


        Runnable p=()->{

            for(int i=0;i<100;i++){
                try {
                    System.out.println("Value inserted+"+i);
                    queue.put(i);

                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Runnable c=()->{
int i=0;
            while (i<100) {

                try {

                    Integer take = queue.take();
                    System.out.println("Value taken out+" + take);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

Thread thread=new Thread(p);
Thread thread1=new Thread(c);

thread.start();

thread1.start();

    }



}
