package MyStack;

import java.lang.annotation.ElementType;
import java.util.Arrays;

public class MyStack  {
    final int GROWTH_SIZE = 5;
    int capacity;
    int element[] = new int[1];
    int elementCount = 0;
    void push(int data){
        if (elementCount==element.length-1){
            capacity = element.length+GROWTH_SIZE;
            element= Arrays.copyOf(element,capacity);
        }

        elementCount++;
        element[elementCount]=data;
        System.out.println("Value "+data+" has been pushed");
    }

    int pop(){
        int topNumber = element[elementCount];
        element[elementCount] = 0;
        elementCount--;
        return topNumber;
    }

    int peek(){
        return element[elementCount];
    }

    //boolean isEmpty(){
    //
    //}

    int size(){
        return elementCount;
    }

    boolean search(int val){
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
    public void main(String[] args) {
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
