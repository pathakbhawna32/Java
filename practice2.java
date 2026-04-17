// FIND OUT LIST OF PASS AND FAIL STUDENTS IN GIVEN LIST THOSE ATTENDEANCE IS MORE THAN 60%

import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class practicee3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l1 = List.of(75,89,65,53,45,59,98);

List<Integer> pass = l1.stream().filter(a -> a > 60).collect(Collectors.toList());

List<Integer> fail = l1.stream().filter(a -> a <= 60).collect(Collectors.toList());

              System.out.println("Pass Students: " + pass);
              System.out.println("Fail Students: " + fail);

	
// to count how many numbers in a list are greater than 50 using filter and count
List<Integer> l3 = List.of(34,56,78,43,24,67,90);
long count = l3.stream().filter(n -> n > 50).count();
System.out.println(count);


// create a list of integers and use STREAM API FILTER TO FILTER ALL EVEN NUMBERS SQUARE THEM AND PRINT THEM USING forEcah
List<Integer> l4 = List.of(1,2,3,4,5,6,7,8,9);
l4.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);

int sum = l4.stream().filter(n -> n % 2 != 0).map(n -> n * 2).reduce(0, Integer::sum);
System.out.println(sum);

// filter all strings starting with letter "A"  sort tehm and and display only the first 3 elements
List<String> l6 = List.of("Apple","Abhi","Anuj","abhay");
List<String>  l7 = l6.stream().filter(n -> n.startsWith("A")).sorted().limit(3);

	
	}
}
