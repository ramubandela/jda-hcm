package com.tesco.integration.hcm_jda.ds.doubly.linkedlist;

public class DoublyLinkedList {

    int data;
    Node head;
    Node tail;
    int size;

    DoublyLinkedList(){
    head=null;
    tail=null;
    size=0;

    }


    private class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
        this.data=data;
        }
    }


    public void add(int value){
        Node newNode=new Node(value);
        if(isEmpty()) {
            head = newNode;
            size=1;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            size++;
        }
        tail=newNode;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int  length(){
        size=size+1;
        return size++;
    }

    public void forwardTraverse(){
Node temp=head;
while(temp !=null){
    System.out.println(temp.data);
    temp=temp.next;
}
    }




    public void backwardTraverse(){

        Node temp=tail;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }

    public void insertAt(int i,int value){
        Node newNode=new Node(value);
        Node temp=head;
        int position=0;
        while(position<i){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.previous=temp;
        newNode.next=temp.next.next;

    }

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        System.out.println(doublyLinkedList.isEmpty());
        doublyLinkedList.add(10);
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);
        System.out.println(doublyLinkedList.isEmpty());
        System.out.println(doublyLinkedList.size);

        System.out.println("...............................");

        doublyLinkedList.forwardTraverse();

        System.out.println("Backword...............................");

        doublyLinkedList.backwardTraverse();
    }

}
