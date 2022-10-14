package com.CCI;

import com.linkedList.singleLinkedList.LinkedList;
import com.linkedList.singleLinkedList.Node;

public class LoopDetectioninLinkedList {
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
         Node n=findKthFromEnd(head,3);
        System.out.println(linkedList);
       // System.out.println(n.value);
        linkedList.tail.next=n;
       // System.out.println(linkedList.tail.value);
       // System.out.println(linkedList.tail.next.value);
        //System.out.println(detectLoop(linkedList.head).value);
        removeLoop(linkedList.head);
        System.out.println(linkedList);

    }

    public static Node detectLoop(Node node){
        Node current=node;
        Node runner=node.next;
        while(runner!=null && current!=null && runner.next!=null){
            if(current==runner){
                return current.next;
            }else{
                current=current.next;
                runner=runner.next.next;
            }

        }
        return null;

    }
    public static void removeLoop(Node node){
        Node current=node;
        Node runner=node.next;
        while(runner!=null && current!=null && runner.next!=null){
            if(current==runner){
                current.next=null;
            }else{
                current=current.next;
                runner=runner.next.next;
            }

        }
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
