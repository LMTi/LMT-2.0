import java.util.*;
import java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res = calc.add(2,3);
        System.out.println("2 + 3 is equal to "+res);
        //List interface insertion order maintained
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(66);
        myList.add(4);
        myList.add(44);
        myList.add(5);
        myList.add(4);
        System.out.println("List insertion order is 2,66,4,44,5,4");
        for (Integer i:myList) {
            System.out.println(i);
        }

        // Set interface
        //Set<Integer> mySet = new TreeSet<Integer>();  ---> TreeSet will keep unique elements and in a Sorted order
        Set<Integer> mySet = new HashSet<Integer>();    //---> will keep only unique elements in RANDOM order
        mySet.addAll(myList);
        System.out.println("Set order");
        for (Integer i:mySet) {
            System.out.println(i);
        }

    }
}
