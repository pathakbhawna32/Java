// how to convert an array into stream api

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class streamapi {

	public static void main(String[] args) {
		

		int arr[] = {3, 4, 7, 89, 43, 80};
		IntStream s = Arrays.stream(arr);
	
		s.forEach(x -> System.out.println(x));
			Stream<Integer> s2 = Stream.of(2, 6, 7, 8, 9);
		s2.forEach(x -> System.out.println(x));
		
		List<Integer> l3 = new ArrayList<>();

		l3.add(23);
		l3.add(45);
		l3.add(69);


		Stream<Integer> s3 = l3.stream();

		// Print each element of the stream using forEach()
		s3.forEach(x -> System.out.println(x));

			}
		}
