package MeetingRooms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {
    public static void main(String[] args) {
        int[][] startEndTimes = {{7,10},{2,4}};
        System.out.println(minMeetingRooms(startEndTimes));
    }

    public static int minMeetingRooms(int[][] intervals){
        //The second input argument to Arrays.sort is a comparator, which is an interface. Below, we will use a lambda expression
        //  to implement that comparator interface from inside the sort methode. This comparator accepts two input
        //  arguments (a and b in this case). These arguments for this implimentation is int[]. b will represent the
        //  row zero (values in row zero will change as it is sorted. b will represent a row to compare to a. Its row
        //  number will change throughout the sort method. This comparator will typically compare the zeroth column of
        //  the two rows being compared. Unless If a[0]==b[0] then the first column of the two rows will be compared.
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0])));

        //With the array sorted, use priority queue to keep track of room usage. The end time of a room gets stored in
        //  the queue. And since its a priority queue, the room with the soonest end time will get polled when needed.
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int[] i : intervals){

            if (!queue.isEmpty()){
                int peek = queue.peek(); //Find out the soonest time a room becomes available.

                //If the next start time comes after the room becomes available, remove the soonest ending schedule
                if (peek <= i[0]){
                    queue.poll();
                }
            }
            //Add the end time for the current needed schedule.
            queue.add(i[1]);
        }
        return queue.size();
    }
}
