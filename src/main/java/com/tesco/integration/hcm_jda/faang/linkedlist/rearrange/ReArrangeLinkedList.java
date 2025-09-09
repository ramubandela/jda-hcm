package com.tesco.integration.hcm_jda.faang.linkedlist.rearrange;

public class ReArrangeLinkedList {

    public static void main(String[] args) {

        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        System.out.print("Integer Original: ");
        intList.printList();
        intList.rearrange();
        System.out.print("Integer Rearranged: ");
        intList.printList();

        // Strings
        MyLinkedList<String> strList = new MyLinkedList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        strList.add("D");

        System.out.print("\nString Original: ");
        strList.printList();
        strList.rearrange();
        System.out.print("String Rearranged: ");
        strList.printList();

    }
}

class Node<T> {
    T value;
    Node next;

    Node(T value) {
        this.value = value;
        this.next = null;
    }
}

class  MyLinkedList<T>{

    Node<T> head;

    public void add(T value){

        Node<T> temp=new Node<>(value);

        if(head==null){
            head=temp;
        }else{
        Node<T> current=head;
            while(current.next !=null){
                current= current.next;

            }
            current.next=temp;
        }
    }

    public void rearrange(){

        if(head==null  || head.next==null){
            return;
        }

        Node<T> slow=head, fast=head;

        while(fast !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        Node<T> second=slow.next;// second array element
        slow.next=null;

        //Reverse second half

        Node<T> current=second;
        Node<T> previous =null;

        while(current !=null){

            Node<T> next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        second = previous;


        Node first=head;

        while(second !=null){
            Node temp1=first.next;
            Node temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;

        }

    }
    public void printList() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}