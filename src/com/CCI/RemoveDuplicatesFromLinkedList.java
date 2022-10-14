package com.CCI;

import com.linkedList.singleLinkedList.LinkedList;
import com.linkedList.singleLinkedList.Node;

import java.util.HashSet;

public class RemoveDuplicatesFromLinkedList {


    public static void main(String[] args) {
     LinkedList linkedList=new LinkedList();
     Node head=linkedList.createLinkedList(2);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(2);

        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(2);
        System.out.println(linkedList);
        removeDuplicatesWithOutBuffer(head);
       System.out.println(linkedList);

    }

    public static void removeDuplicates(Node head){
        Node current=head;
        HashSet<Integer> hashSet=new HashSet<>();
        Node prev=null;
        while(current!=null){
            if(!hashSet.contains(current.value)){
                hashSet.add(current.value);
                prev=current;
            }else{
                prev.next=current.next;
            }

            current=current.next;
        }

    }

    public static void removeDuplicatesWithOutBuffer(Node head){

        Node currenNode=head;
        while(currenNode!=null){
            Node runner=currenNode;
            while(runner.next!=null){
                if(runner.next.value==currenNode.value){
                    runner.next=runner.next.next;
                }else{
                    runner=runner.next;
                }
            }
            currenNode=currenNode.next;
        }



    }




}
