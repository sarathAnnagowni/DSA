package com.linkedList.singleLinkedList;

public class LinkedList {
    Node head;
    Node tail;
    private int size;

    public Node createLinkedList(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    public Node insertAtBegin(int nodeValue){
        Node node=new Node(nodeValue);
        node.next=head;
        head=node;
        size++;
        return head;
    }


    public Node insertAtEnd(int nodeValue){
        Node node=new Node(nodeValue);
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=node;
        tail=node;
        size++;
        return head;
    }

    public void reverse(){
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next= current.next;
            if(next==null){
                head=current;
            }
            current.next=prev;
            prev=current;
            current=next;
        }


    }
    public boolean insertAfterNode(int nodeValueToInsert,int afterNodeValue) {

        Node node = new Node(nodeValueToInsert);
        if(afterNodeValue==tail.value){
            tail.next=node;
            tail=node;
            return true;
        }
        Node curr = head;
        Node nextToCurrentNode = null;
        while (curr.next != null) {
            if (curr.value == afterNodeValue) {
                nextToCurrentNode = curr.next;
                break;
            }
            curr=curr.next;
        }
        if (nextToCurrentNode == null) {
            return false;
        }
        node.next = nextToCurrentNode;
        if(tail!=curr){
            curr.next = node;
        }else{
            curr.next=node;
            tail=node;
        }
        size++;
        return true;

    }

    @Override
    public String toString() {
        Node node=head;
        StringBuilder stringBuilder=new StringBuilder();
        while(node!=null){
            if(node.next==null){
                stringBuilder.append(node.value);
            }else{
                stringBuilder.append(node.value+"----->");
            }
            node=node.next;

        }


        return stringBuilder.toString();
    }
}
