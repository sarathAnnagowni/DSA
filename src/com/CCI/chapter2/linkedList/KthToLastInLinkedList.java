package com.CCI.chapter2.linkedList;

import com.linkedList.singleLinkedList.LinkedList;
import com.linkedList.singleLinkedList.Node;

public class KthToLastInLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node head = linkedList.createLinkedList(2);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(8);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(19);
        System.out.println(linkedList);
        Node er = findKthFromEnd(head, -1);
       // System.out.println(er.value);
        removeNodeInMiddle(er);
        System.out.println(linkedList);
    }
    public static boolean removeNodeInMiddle(Node node){
        if(node==null || node.next==null ){
            return false;
        }
        Node temp=node.next;
        node.value=temp.value;
        node.next=temp.next;

        return true;

    }
    public static Node findKthFromEnd(Node node,int k){
        Node p1=node;
        Node p2=node;
        if(k<=0){
            return null;
        }
        while(k>0){
            if(p2!=null){
                p2=p2.next;
                k--;
            }else{
                return null;
            }

        }
        while(p2!=null){
           p1=p1.next;
           p2=p2.next;
        }

        return p1;
    }
}
