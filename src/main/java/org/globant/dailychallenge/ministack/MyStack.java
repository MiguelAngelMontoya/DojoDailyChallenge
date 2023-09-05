package org.globant.dailychallenge.ministack;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> stack;

    public MyStack(){
        this.stack = new ArrayList<>();
    }

    public void push(int data){
        stack.add(data);
    }

    public MyStack pop(){
        if(stack.size()>0)
            stack.remove(stack.size()-1);
        return this;
    }

    public int min(MyStack stack){
        int min=0;
        for(int i=0; i<stack.getStack().size(); i++){
            if(i==0) {
                min = stack.getStack().get(i);
            }else{
                min = (stack.getStack().get(i) < min)? stack.getStack().get(i):min;
            }
        }
        return min;
    }

    public int max(MyStack stack){
        int man=0;
        for(int i=0; i<stack.getStack().size(); i++){
            if(i==0) {
                man = stack.getStack().get(i);
            }else{
                man = (stack.getStack().get(i) > man)? stack.getStack().get(i):man;
            }
        }
        return man;
    }

    @Override
    public String toString() {
        return this.stack.toString();
    }

    public ArrayList<Integer> getStack() {
        return stack;
    }
}
