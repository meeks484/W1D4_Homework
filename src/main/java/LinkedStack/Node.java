package LinkedStack;

import ReverseLinkedList.ListNode;

public class Node {
    //This class represents a list node with two properties: val and next. The val is the number being stored, and
    //  next represents the link to the previous (or next) node in the link.
    int val;
    Node next;

    //default constructor
    public Node(){}
    //single parameter constructor
    public Node(int val){

        this.val = val;
    }
    //two parameter constructor.
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
