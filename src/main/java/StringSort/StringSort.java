package StringSort;

import java.util.Arrays;

public class StringSort {

    public static void main(String[] args) {
        String stringIn = "tree";
        System.out.println("Input String: " + stringIn);
        char stringArray[] = stringIn.toCharArray();
        //Use the sort methode to sort the array. The sort methode uses the Dual Pivot Quick Sort theory in sorting.
        //  the time will remain O(n^2).
        Arrays.sort(stringArray);
        int i = 0;
        while (i < stringArray.length){
            System.out.print(stringArray[i]);
            i++;
        }


    }




}
