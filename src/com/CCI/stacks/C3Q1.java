package com.CCI.stacks;
/*
Implement N Stacks Using Single Array
 */
public class C3Q1 {
    public static void main(String[] args) {
  KStacks kStacks=new KStacks(10,3);
        //kStacks.printKstacks();
        kStacks.push(2,25);
        kStacks.push(1,20);
        kStacks.push(1,10);
        kStacks.push(2,15);
       // kStacks.pop(1);
        kStacks.push(2,25);
        kStacks.push(0,45);
        kStacks.push(0,50);
        kStacks.push(2,35);

        kStacks.push(1,33);

        System.out.println(kStacks.pop(1));
        System.out.println(kStacks.pop(1));
        System.out.println(kStacks.pop(1));
        System.out.println(kStacks.pop(1));
        kStacks.push(0,90);
        kStacks.push(0,100);

        System.out.println("========================");
        kStacks.printKstacks();





    }

}
class KStacks{
    int[] data;
    int[] next;
    int free;
    int top[];

    public KStacks(){
        data=new int[30];
        next=new int[30];
        free=0;
        top=new int[5];
        fillNextArray();
        fillTopOfAllStacks();
    }

    private void fillTopOfAllStacks() {
        for (int i=0;i<top.length;i++){
            top[i]=-1;
        }
    }

    private void fillNextArray() {
        for (int i=0;i<next.length;i++) {
            next[i]=i+1;
        }
        next[next.length-1]=-1;
    }

    public KStacks(int size,int noOfStacks){
        data=new int[size];
        next=new int[size];
        free=0;
        top=new int[noOfStacks];
        fillNextArray();
        fillTopOfAllStacks();
    }

    private boolean isStackFull(){
        return next[free]==-1;
    }
    private boolean isStackEmpty(int sn){
        return top[sn]==-1;
    }


    public void push(int sn,int element){
        if(isStackFull()){
            throw new RuntimeException("Stack is full");
        }else{
            int i=free;
            free=next[i];
            next[i]=top[sn];
            top[sn]=i;
            data[i]=element;
        }

    }



    public int pop(int sn){
        if(isStackEmpty(sn)){
            throw new RuntimeException("Stack is empty");

        }else{
            int i=top[sn];
            top[sn]=next[i];
            next[i]=free;
            free=i;
            return data[i];
        }
    }


    public void printKstacks(){
        System.out.println("Free Spot "+free);
        System.out.println("Elements Data ");
        for (int i=0;i<data.length;i++) {
            System.out.println("index :: "+i+" value :: "+data[i]);
        }
        System.out.println("");
        System.out.println("Next Array ");
        for (int i=0;i<next.length;i++) {
            System.out.println("index :: "+i+" value :: "+next[i]);
        }
        System.out.println("");
        System.out.println("Top Array ");
        for (int i=0;i<top.length;i++) {
            System.out.println("index :: "+i+" value :: "+top[i]);
        }

    }


}