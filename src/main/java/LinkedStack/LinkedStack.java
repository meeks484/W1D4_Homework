package LinkedStack;

public class LinkedStack {
    static Node head;
    static int NodeNumber = 0;
    static void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        NodeNumber++;
        System.out.println("Value "+data+" has been pushed");
    }

    static int pop(){
        Node temp = head;
        head = head.next;
        NodeNumber--;
        return temp.val;
    }

    static int peek(){
        return head.val;
    }

    static boolean isEmpty(){
        if (head == null){
            return true;
        }else{
            return false;
        }
    }

    static int size(){
        return NodeNumber;
    }

    static boolean search(int val){
        Node temp = head;
        boolean found = false;
        while(temp != null){
            if (temp.val==val){
                found = true;
            }
            temp = temp.next;
        }
        if (found){
            System.out.println("Number " + val + " has been found");
            return true;
        }else{
            System.out.println("Number " + val + " was not found");
            return false;
        }
    }

    public static void main(String[] args) {
        push(25);
        push(15);
        push(10);
        push(8);
        System.out.println("Peek at the top: " + peek());
        push(30);
        System.out.println("Peek at the top: " + peek());
        System.out.println("Number of Nodes: " + size());
        System.out.println(search(10));
        System.out.println(pop() + " has been popped from the top");
        System.out.println("Number of Nodes: " + size());
        System.out.println("Peek at the top: " + peek());
        System.out.println(pop() + " has been popped from the top");
        System.out.println("Number of Nodes: " + size());
        System.out.println("Peek at the top: " + peek());
        System.out.println(pop() + " has been popped from the top");


    }
}
