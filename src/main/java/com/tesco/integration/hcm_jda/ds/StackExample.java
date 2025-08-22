package com.tesco.integration.hcm_jda.ds;

public class StackExample {


    int top;
    int ar[];
    int size;


    public StackExample(int size){
        top=-1;
        ar=new int[size];
    }

    public void add(int data){
        if(top>size){
            throw new RuntimeException("Out of bound exception");
        }
        ar[++top]=data;
    }

    public int delete(){
        if(top==-1){
    throw new RuntimeException("Stack is empty");
}
        int i = ar[top--];
        return i;
    }

}
