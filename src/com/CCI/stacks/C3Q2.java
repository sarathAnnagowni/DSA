package com.CCI.stacks;


import java.lang.annotation.ElementType;
import java.util.Arrays;

/*
Design special stack with getmin in O(1) time time and O(1) space
 */
public class C3Q2 {
    public static void main(String[] args) {
        Stack stack=new Stack(15);
        stack.push(9);
        stack.push(6);
        /*stack.push(4);
        stack.push(2);
        stack.push(9);
        stack.push(1);*/
        //System.out.println(stack);
        System.out.println( stack.pop());
       // System.out.println(stack.pop());
        //System.out.println(stack.getMin());






    }
}


class Stack{
    int element;

    int top=-1;

    int[] stackArray=null;
    int min=0;
    Stack(int size){
        stackArray =new int[size];
    }

    Stack(){
        stackArray =new int[20];
    }

    public void push(int element){
        if(top>= stackArray.length ){
            System.out.println("Stack Overflow");
        }
        else if(top==-1){
            top=top+1;
            stackArray[top]=element;
            min=element;
        }
        else if(element > min){
            top=top+1;
            stackArray[top]=element;
        }else{
            int value=2*element-min;
            min=element;
            top=top+1;
            stackArray[top]=value;
        }

    }



    public int pop( ){
       if(top==-1){
           System.out.println("Stack Empty");
       }else if(stackArray[top] > min){
           int value=stackArray[top];
           top=top-1;
           return value;
       }else{
           int value=min;
           min=2*min-stackArray[top];
           top=top-1;
           return value;
       }
      return 0;
    }

    public int getMin(){
        return min;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "element=" + element +
                ", top=" + top +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", min=" + min +
                '}';
    }
}
