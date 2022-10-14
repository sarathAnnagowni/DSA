package com.linkedList.singleLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
       linkedList.createLinkedList(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
       // linkedList.reverse();
      /*  linkedList.insertAfterNode(7,6);
        linkedList.insertAfterNode(8,6);
        linkedList.insertAfterNode(9,8);*/

        System.out.println(linkedList);
       /* System.out.println(linkedList.head.value);
        System.out.println(linkedList.tail.value);
        System.out.println(linkedList.tail.next);*/

    }
}
