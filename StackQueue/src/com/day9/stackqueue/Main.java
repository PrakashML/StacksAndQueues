package com.day9.stackqueue;

public class Main {
    public static void main(String[] args) {
        LLQueue queue = new LLQueue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
    }
}
