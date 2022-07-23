package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue<T> {
    //T theQueue[] = new T[5];
    static Object[] theQueue;
    static int Qelement=0;

    static public void main(String[] args) {
        //PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        theQueue = new Object[20];
        add(10);
        add(20);
        add(15);
        add(5);
        add(20);
        add(25);
        add(2);
        add(1);
        add(-1);
        add(3);
        poll();
        poll();
        poll();
        poll();
        poll();
        poll();
        poll();
        poll();
        poll();
        poll();





    }

    static<T> T peek() {
        if (theQueue[0] == null) {
            return null;
        } else {
            return (T) theQueue[0];
        }
    }

    static<T> T remove(){
        if (theQueue[0] == null){
            throw new NullPointerException();
        }else{
            return removePrioritize();
        }
    }
    static<T> T poll(){
        if (theQueue[0] == null){
            return null;
        }else{
            T pulled = removePrioritize();
            System.out.println("Pulling: " + pulled);
            System.out.print("Queue: ");
            for (int i =0 ; i < Qelement ; i++) {
                System.out.print(theQueue[i] + " ");
            }
            return pulled;
        }
    }

    static<T> T removePrioritize(){
        Qelement--;
        T result = (T) theQueue[0];
        T tail = (T) theQueue[Qelement];
        theQueue[Qelement]=null;
        Comparable<T> key = (Comparable<T>)tail;
        int half = Qelement >>> 1;
        int k = 0;
        while (k < half){
            int childOfPrevious = (k << 1) + 1;
            Object leastGuess = theQueue[childOfPrevious];
            int rightOfChild = childOfPrevious + 1;
            if (rightOfChild < Qelement && ((Comparable<T>) leastGuess).compareTo((T) theQueue[rightOfChild])>0){
                childOfPrevious=rightOfChild;
                leastGuess = theQueue[childOfPrevious];
            }
            if (key.compareTo((T) leastGuess)<=0){
                break;
            }
            theQueue[k]=leastGuess;
            k= childOfPrevious;
        }
        theQueue[k]=key;
        return result;
    }
    static<T> T element() {
        if (theQueue[0] == null) {
            throw new NullPointerException();
        } else {
            return (T) theQueue[0];
        }
    }

    static<T> void add(T data){
        if (Qelement== theQueue.length){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            System.out.println("Adding " + data);
            prioritize(data);
            System.out.print("Queue: ");
            for (int i =0 ; i < Qelement ; i++) {
                System.out.print(theQueue[i] + " ");
            }
        }
    }
    static<T> boolean offer(T data){
        if (Qelement== theQueue.length){
            return false;
        }else{
            prioritize(data);
            return true;
        }
    }
    static<T> void prioritize(T data){
        Comparable<T> key = (Comparable<T>) data;
        int k = Qelement;
        while (k > 0){
            int parent = (k-1)>>>1;
            Object e = theQueue[parent];
            if (key.compareTo((T) e)>=0)
                break;
            theQueue[k]=e;
            k=parent;
        }
        theQueue[k]=key;
        Qelement++;
    }




}
