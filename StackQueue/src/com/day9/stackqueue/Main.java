package com.day9.stackqueue;

public class Main {
    public static void main(String[] args) {
        LLStack stack = new LLStack();
        stack.add(70);
        stack.add(30);
        stack.add(56);
        System.out.println("The Top element is : "+ stack.peak());
        System.out.println(stack.pop() + " is popped out.");
        System.out.println("The Top element is : "+ stack.peak());
        System.out.println(stack.pop()+ " is popped out.");
        System.out.println("The Top element is : "+ stack.peak());
        System.out.println(stack.pop()+ " is popped out");
        System.out.println("The Top element is : "+ stack.peak());
        System.out.println(stack.pop());
        stack.displayStack();
    }
}
