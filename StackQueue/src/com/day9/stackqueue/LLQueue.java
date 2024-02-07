package com.day9.stackqueue;

public class LLQueue {
    private Node front;
    private Node rear;
    int size = 0;
    public LLQueue(){
        this.front = null;
        this.rear = null;
    }

    boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int data){
        Node temp = new Node(data);
        if(front == null){
            front = temp;
            rear = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public void dequeue(){
        Node temp = front;
        if(front == null){
            System.out.println("queue is empty");
        }
        else{
            System.out.println(temp.data +" is removed from the queue");
            front = front.next;
            size--;
        }
    }
    public void displayQueue(){
        Node current = front;
        if(front == null){
            System.out.println("Queue is empty");
        }
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("END");
    }


}
