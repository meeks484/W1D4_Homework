package MaxPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(10,Collections.reverseOrder());
        maxQueue.add(5);
        maxQueue.add(7);
        maxQueue.add((2));
        maxQueue.add(8);
        System.out.println("Poll: "+maxQueue.poll());
        System.out.println("Poll: "+maxQueue.poll());
        System.out.println("Poll: "+maxQueue.poll());
        System.out.println("Poll: "+maxQueue.poll());
    }

}
