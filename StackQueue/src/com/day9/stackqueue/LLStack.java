package com.day9.stackqueue;

public class LLStack {
    private Node top;
    public LLStack(){
        this.top = null;
    }

    public void add(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    public void displayStack(){
        Node current = top;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("END");
    }
}
