package MyStack;

import java.lang.annotation.ElementType;
import java.util.Arrays;

public class MyStack  {
    static final int GROWTH_SIZE = 5;
    static int capacity;
    static int element[] = new int[1];
    static int elementCount = 0;
    static void push(int data){
        if (elementCount==element.length-1){
            capacity = element.length+GROWTH_SIZE;
            element= Arrays.copyOf(element,capacity);
        }

        elementCount++;
        element[elementCount]=data;
        System.out.println("Value "+data+" has been pushed");
    }

    static int pop(){
        int topNumber = element[elementCount];
        element[elementCount] = 0;
        elementCount--;
        return topNumber;
    }

    static int peek(){
        return element[elementCount];
    }

    //boolean isEmpty(){
    //
    //}

    static int size(){
        return elementCount;
    }

    static boolean search(int val){
        boolean found = false;
        for (int i = 0 ; i < elementCount ; i++){
            if (element[i]==val) {
                found = true;
            }
        }
        if (found){
            return true;
        }else{
            return false;
        }
    }
    static public void main(String[] args) {
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
