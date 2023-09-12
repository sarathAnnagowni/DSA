package com.CCI.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds
 * some threshold. Implement a data structure SetOfStacks that mimics this.
 * SetOfStacks should be composed of several stacks, and should create a new stack once
 * the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
 * behave identically to a single stack (that is, pop() should return the same values as it
 * would if there were just a single stack).
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific
 * sub-stack.
 **/

public class C3Q3 {
    public static void main(String[] args) {
        SetOfStacks setOfStacks=new SetOfStacks();
        for(int i=1;i<41;i++){
            setOfStacks.push(i);
        }
        setOfStacks.display();
        for(int i=1;i<41;i++){
           System.out.println(setOfStacks.pop());
        }
    }
}
class SetOfStacks{

    public void display() {
        for (StackNode stackNode:setOfStacks) {
            System.out.println(stackNode);
            System.out.println("====================");
        }


    }

    List<StackNode> setOfStacks=new ArrayList<>();

    SetOfStacks(){

    }

    public void push(int elemetn){
        StackNode stackNode= getLastStack();
        if(stackNode==null){
            stackNode=new StackNode(10);
            stackNode.push(elemetn);
            setOfStacks.add(stackNode);
        }else{
            if(!stackNode.isStackFull()){
                stackNode.push(elemetn);
            }else{
                StackNode newStackNode= new StackNode(10);
                newStackNode.push(elemetn);
                setOfStacks.add(newStackNode);
            }

        }

    }


    public int pop(){
        StackNode stackNode= getLastStack();
        if(stackNode==null){
            throw new RuntimeException("Stack is Empty");
        }
        else if(!stackNode.isStackEmpty()){
            return stackNode.pop();
        }else{
            if(setOfStacks.size()>0){
                setOfStacks.remove(stackNode);
                StackNode previousStackNode= getLastStack();
                if(!previousStackNode.isStackEmpty()){
                        return previousStackNode.pop();
                    }
                else{
                    System.out.println("Stack is Empty");
                }

            }

        }
        return -1;
    }

    private StackNode getLastStack(){
        int size=setOfStacks.size();
        if(size==0){
            return null;
        }else{
           return setOfStacks.get(size-1);
        }
    }





}
class StackNode{

    int top=-1;
    int[] data=null;
    StackNode(int size){
        data=new int[size];
    }

    public boolean isStackFull(){
        return top>=data.length-1;
    }
    public boolean isStackEmpty(){
        return top<=-1;
    }
    public void push(int element){
        if(top>=this.data.length){
            throw new RuntimeException("Stack is full");
        }else{
            top=top+1;
            data[top]=element;
        }
    }

    public int pop(){
        if(top==-1){
            throw new RuntimeException("Stack is Empty");
        }else{
            int dat=data[top];
            top=top-1;
            return dat;
        }
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "top=" + top +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}