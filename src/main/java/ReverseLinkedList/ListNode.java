package ReverseLinkedList;

public class ListNode {
    //This class represents a list node with two properties: val and next. The val is the number being stored, and
    //  next represents the link to the previous (or next) node in the link.
    int val;
    ListNode next;

    //default constructor
    public ListNode(){}
    //single parameter constructor
    public ListNode(int val){
        this.val = val;
    }
    //two parameter constructor.
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
