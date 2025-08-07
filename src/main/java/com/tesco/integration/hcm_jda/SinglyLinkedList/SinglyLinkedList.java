package com.tesco.integration.hcm_jda.SinglyLinkedList;

public class SinglyLinkedList {

    Node head;
    int size;
    SinglyLinkedList(){

    }

    public void  add(int value){

        if(head==null){
            head=new Node(value);
        }
        Node temp=head;
        while(temp.next!=null){
             temp=temp.next;
        }
        temp.next=new Node(value);
        size++;

    }

    public void printElements(){
        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
            System.out.println(temp.value);
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);

        //System.out.println(singlyLinkedList.size);

        singlyLinkedList.printElements();
    }
}
