package com.tesco.integration.hcm_jda.faang.linkedlist;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        MyLiiknedList myLiiknedList=new MyLiiknedList();
        myLiiknedList.add(1);
        myLiiknedList.add(2);
        myLiiknedList.add(3);
        myLiiknedList.add(4);
        myLiiknedList.add(5);
        myLiiknedList.add(6);


        System.out.println(myLiiknedList.size()+"...........size");


        System.out.println(myLiiknedList.findMiddle()+"...........findMiddle");

        myLiiknedList.reverse();

        System.out.println("After Reverse Middle: " + myLiiknedList.findMiddle()); // 3



    }

}


class Node{

    int value;
    Node next;

    Node(int value){
this.value=value;
this.next=null;
    }
}

class MyLiiknedList{

    Node head;

    public MyLiiknedList(){
        this.head=null;
    }
    public void add(int i){
        Node temp=new Node(i);

        if(head==null){
        head=temp;
        }else{
           Node current=head;

           while(current.next !=null){
               current= current.next;
           }
            current.next=temp;
        }

    }

    public int size(){
        int size=0;
        Node temp=head;

        while(temp !=null){
            temp=temp.next;
            size++;
        }

        return size;
    }


    public int findMiddle(){

        Node slower=head;
        Node faster=head;

        while(faster !=null && faster.next !=null){

            slower=slower.next;
            faster=faster.next.next;
        }
        return  slower.value;
    }

    public void reverse(){

        Node previous=null;
        Node current= head;


        while(current !=null){
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head = previous;

    }
}