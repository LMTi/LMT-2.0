import java.util.ArrayList;
import java.util.Collections.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res = calc.add(2,3);
        System.out.println("2 + 3 is equal to "+calc);
        //List interface iorder maintained
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        myList.add(44);
        myList.add(5);
        for (Integer i:myList) {
            System.out.println(i);
        }

        // Set interface
        Set<Integer> mySet = new HashSet<Integer>();


    }
}
