package org.globant.dailychallenge;

import org.globant.dailychallenge.ministack.MyStack;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.push(50);
        stack.push(40);

        System.out.println("Add= " + stack);
        System.out.println("Top= " + stack.max(stack));
        System.out.println("Min= " + stack.min(stack));
        System.out.println("Pop= " + stack.pop());
    }
}