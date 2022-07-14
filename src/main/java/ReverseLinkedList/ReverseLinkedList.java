package ReverseLinkedList;


public class ReverseLinkedList {
    static ListNode head;

    public static void main(String[] args) {

        //Use the push methode to insert values into the initial linked list.
        //Each call of the push method will create a node with a value, and a link to the previous node via "next" variable.
        //
        push(20, head);
        push(4, head);
        push(15, head);
        push(85,head);

        //Print out the values of the linked list.
        System.out.println("Given linked list");
        print();

        //Use the reverse methode to reverse the numbers
        head = reverse(head);

        //Print out the values of the reversed linked list.
        System.out.println("Reversed Linked list");
        print();
    }
    public static void push(int val,ListNode next){
        //This methode creates a new ListNode object. Each new node that is created has a "link" to the previous
        //  node that was created via the "next" property.
        ListNode temp = new ListNode(val,next);
        temp.next = head;   //Head represents the current node. This line links the current node to what will soon be the next node.
        head = temp;    //Set head equal to temp. This effectively sets head as the current node, with all previous nodes link in its .next member
    }
    public static ListNode reverse(ListNode head){
        // the reverse methode will reverse the order of the linked list via recursion. The first node is null, so when
        //  a node is not equal to "null", we know we're not at the end of the link. call the methode again, with the
        //  next node as the input, and check if we've reached a null value. Continue process until we've reached a null
        //  value.
        if (head == null || head.next == null){
            return head;
        }
        ListNode rest = reverse(head.next);

        //head.next.next=head will essentially extend the nodes forever. If .next is address@743 and .next.next is
        //  address@744, then this equation will extend the object to have an infinite line of nexts, that go back and
        //  fourth between 743 and 744. This in turn will have the inverse effect on the variable rest. Rest is
        //  pointing to the same address as head.next.next. so rest will go back and fourth between 744 and 743 for
        //  infinity.
        head.next.next = head;

        head.next = null;//this will end the infinite effect caused by the previous line. But the parameter rest will
                        //  retain all previous values because the pointer for head.next will be at the end of the line
                        // on rest.

        return rest; // return rest.
    }

    private static void print(){
        //print the linked values.
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }



}
