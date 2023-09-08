package org.globant.dailychallenge.ministack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack stack;

    @BeforeEach
    public void setUp(){
        this.stack = new MyStack();
    }

    @Test
    void validateResultUsingPushMethod(){
        ArrayList<Integer> arrayExpected = new ArrayList<>();
        arrayExpected.add(10);
        this.stack.push(10);
        Assertions.assertEquals(arrayExpected, this.stack.getStack());
    }
    @Test
    void validateResultUsingPopMethod(){
        MyStack stack = new MyStack();
        stack.push(10);
        stack.pop();

        Assertions.assertEquals(new ArrayList<Integer>(), stack.getStack());
    }
    @Test
    void validateResultUsingMinMethod(){
        stack.push(10);
        stack.push(30);
        stack.push(20);

        Assertions.assertEquals(10, stack.min(stack));
    }
    @Test
    void validateResultUsingMaxMethod(){
        stack.push(10);
        stack.push(30);
        stack.push(20);

        Assertions.assertEquals(30, stack.max(stack));
    }

    @Test
    void testToString() {
        stack.push(10);
        Assertions.assertEquals("[10]", stack.toString());
    }
}