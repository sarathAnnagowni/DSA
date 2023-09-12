package com.CCI.chapter2.linkedList;

import com.linkedList.singleLinkedList.LinkedList;
import com.linkedList.singleLinkedList.Node;

/*
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.



Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
 */
public class PartitionOfListAroundXValue {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node head = linkedList.createLinkedList(9);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(1);


        linkedList.insertAtEnd(656);

        System.out.println(linkedList);
       Node node= partition(head,6);
       StringBuilder stringBuilder=new StringBuilder();
        while(node!=null){
            if(node.next==null){
                stringBuilder.append(node.value);
            }else{
                stringBuilder.append(node.value+"----->");
            }
            node=node.next;
        }
        System.out.println(stringBuilder.toString());
    }

    public static Node partition(Node head,int K){
        LinkedList lesserLinkedList=new LinkedList();
        LinkedList greaterLinkedList=new LinkedList();
        Node lesserHead=null;
        Node greaterHead=null;
        Node currNode=head;
        while(currNode!=null){
            if(currNode.value<K){
                if(lesserHead==null){
                    lesserHead=lesserLinkedList.createLinkedList(currNode.value);
                }else{
                    lesserLinkedList.insertAtEnd(currNode.value);
                }
            }else{
                if(greaterHead==null){
                    greaterHead=greaterLinkedList.createLinkedList(currNode.value);
                }else{
                    greaterLinkedList.insertAtEnd(currNode.value);
                }
            }
            currNode=currNode.next;
        }

        if(lesserHead==null && greaterHead ==null){
            return null;
        }else if(lesserHead==null){
            return greaterHead;
        }else if(greaterHead==null){
            return lesserHead;
        }else{
            lesserLinkedList.tail.next=greaterLinkedList.head;
            return lesserHead;
        }

    }
}
