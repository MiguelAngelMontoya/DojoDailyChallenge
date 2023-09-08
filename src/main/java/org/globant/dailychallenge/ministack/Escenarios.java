package org.globant.dailychallenge.ministack;

public class Escenarios {
    public MyStack probarEscenario(){
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

        return new MyStack();
    }
}
