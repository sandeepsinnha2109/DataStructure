package com.linkedList;

public class List {
    Node head;
    public void add(int data){
        if (head==null){
            head=new Node(data);
        }else{
            Node current =head;
            while(current.next!=null){
                current=current.next;
            }
        }
    }

    public void print(){
        Node current=head;

        if(current.next==null){
            System.out.println(current.data+" ");
        }
    }

}
