import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;




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

        // Stream api
        // longest word in a string
        String str = "good Morning";
        Optional<String> resul = Stream.of(str.split(" "))
                .max(Comparator.comparing(String::length));
        System.out.println("longest word is "+resul);

        List<Integer> myList1 = Arrays.asList(101,21,339,405,153,601);
        Optional<Integer> secHighest = myList1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("second highest "+secHighest);
        //generate OTP
        int length=5;
        SecureRandom secureRandom = new SecureRandom();
        String otp;
        otp = secureRandom.ints(length,0,10).mapToObj(i -> String.valueOf(i))
                .collect(Collectors.joining());
        System.out.println("OTP is "+otp);

        


        //
    }
}
