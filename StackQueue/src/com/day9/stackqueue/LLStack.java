package com.day9.stackqueue;

public class LLStack {
    private Node top;
    public boolean isEmpty(){
        return top == null;
    }
    public LLStack(){
        this.top = null;
    }

    public void add(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    public int peak(){
        if(isEmpty()){
            System.out.println("stack is empty, cannot pop");
        }
        return top.data;
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
