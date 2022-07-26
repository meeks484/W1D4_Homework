package TwoSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TwoSets{
    public static<T> void main(String[] args) {
        Set<String> set1 = new HashSet<String>();

        Set<String> set2 = new HashSet<String>();

        Set<String> set3 = new HashSet<String>();

        set1.add("name1");
        set1.add("name2");
        set1.add("name3");
        set1.add("name4");
        set2.add("name2");
        set2.add("name3");
        set2.add("name4");
        set2.add("name5");

        Iterator<String> it1 = set1.iterator();
        System.out.println("Components of Set 1 are: ");
        while (it1.hasNext()){
            System.out.print(it1.next() + " ");
        }
        System.out.println("");

        Iterator<String> it2 = set2.iterator();
        System.out.println("Components of Set 2 are: ");
        String compareString;
        while (it2.hasNext()){
            System.out.print((compareString=it2.next()) + " ");
            if (set1.contains(compareString)){
                set3.add(compareString);
            }
        }
        System.out.println("");

        Iterator<String> it3 = set3.iterator();
        System.out.println("Shared Components between set 1 and 2 are: ");
        while (it3.hasNext()){
            System.out.print(it3.next() + " ");
        }
        System.out.println("");
    }
}
