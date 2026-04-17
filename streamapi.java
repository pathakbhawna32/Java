// how to convert an array into stream api

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class streamapi {

	public static void main(String[] args) {
		
		// 1. Create an integer array
		int arr[] = {3, 4, 7, 89, 43, 80};
		
		// Convert array into IntStream using Arrays.stream()
		IntStream s = Arrays.stream(arr);
		
		// Print each element of the stream using forEach()
		s.forEach(x -> System.out.println(x));
		
		
		// 2. Create Stream directly by giving values
		Stream<Integer> s2 = Stream.of(2, 6, 7, 8, 9);
		
		// Print each element of the stream using forEach()
		s2.forEach(x -> System.out.println(x));
		
		
		// 3. Create Stream from Collection (List)

		// Create an ArrayList of Integer type
		List<Integer> l3 = new ArrayList<>();

		// Add elements into the list
		l3.add(23);
		l3.add(45);
		l3.add(69);

		// Convert List into Stream using stream() method
		Stream<Integer> s3 = l3.stream();

		// Print each element of the stream using forEach()
		s3.forEach(x -> System.out.println(x));

			}
		}
