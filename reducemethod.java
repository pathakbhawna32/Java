// reduce  - it tkes 2 parameters by default

import java.util.*;

public class reducemethodd {

    public static void main(String[] args) {

        // Create a list of integers
        // List.of() is used to create an immutable list
        // Immutable means we cannot add or remove elements later
        List<Integer> l1 = List.of(10, 34, 56, 34, 78);

        // stream() converts the list into a stream
        // reduce() is used to combine all elements of the stream into one single result
        // Here, we are adding all elements one by one
        //
        // (e1, e2) -> e1 + e2
        // e1 = previous result
        // e2 = current element
        //
        // Working:
        // Step 1: 10 + 34 = 44
        // Step 2: 44 + 56 = 100
        // Step 3: 100 + 34 = 134
        // Step 4: 134 + 78 = 212
        //
        // Final result = 212
        //
        // IMPORTANT:
        // reduce() without initial value returns Optional<Integer>
        // So we should store it in Optional<Integer>

        // FIRST WAY 
       Optional x = l1.stream().reduce((e1, e2) -> e1 + e2); 
        // Print the result
        // get() is used to extract the value from Optional
        System.out.println(x);
        
     // SECOND WAY
     l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println); 
        
        // THIRD WAY
        int sum = l1.stream().reduce(0,(e1,e2)->e1+e2);
        System.out.println(sum);
    }
}
