package com.tesco.integration.hcm_jda.ds;

public class EnqueNDeque {

    int front;
    int rear;
    int length;
    int ar[];
    int size;

    public EnqueNDeque(int size){
    front =-1;
    rear=-1;
    length=0;
    this.size=size;
    ar=new int[size];
    }


    public void enQueue(int data){
        if(length<size) {

            if (rear == -1 && front == -1) {
                ar[++rear] = data;
                ++front;
            } else {
                ar[++rear] = data;
            }

            length++;
        }else{
            throw  new RuntimeException("index out of bound");
        }
    }

    public int deQueue(){

        return ar[front--];

    }

}
