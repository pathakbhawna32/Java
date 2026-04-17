// FILTER NUMBER USING GREATER THAN 50 FROM A LIST OF INTEGERS AND STORE THEM IN A NEW LIST

import java.util.*;
import java.util.stream.Collectors;


public class practicee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l1 = List.of(10,56,34,76,68,23);
List<Integer> l2 = l1.stream().filter(n -> n > 50).collect(Collectors.toList());;
System.out.println(l2);
	


// WRITE A JAVA PROGRAM TO FILTER POSITIVE NUMBERS GREATER THAN 20 FROM A LIST OF LIST OF INTEGERS
List<Integer> l4 = List.of(15,16,10,9,23,34,56);
List<Integer> l3 = l4.stream().filter(n -> n > 20).collect(Collectors.toList());
System.out.println(l3);


// to filter all strings that start with letter 'A' from a list of strings

List<String> s2 = List.of("Apple","Cat","Dog","Abhay", "Anuj", "Ship");
List<String> s3 = s2.stream().filter(n-> n.startsWith("A")).collect(Collectors.toList());
System.out.println(s3);

// to filter all strings that ends with "A" from a list of strings

List<String> s4 = List.of("BHAWANA","KAJAL","DIVYA","KASHIKA","JAGRITI");
List<String> s5 = s4.stream().filter(n-> n.endsWith("A")).collect(Collectors.toList());
System.out.println(s5);

// filter positive numbers from a list of integers
List<Integer> l5 = List.of(-29,90,-32,43,12,-65);
List<Integer> l6 = l5.stream().filter(n -> n > 0).collect(Collectors.toList());
System.out.println(l6);

// filter odd numbers from a list of integers
List<Integer> l7 = List.of(13,12,14,15,16,13,12,17,19,10);
List<Integer> l8 = l7.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
System.out.println(l8);

//filter all strings containing "A" from alist of strings

List<String> s6 = List.of("BHAWANA","SHUKLA","BOY","DOG","CAT");
List<String> s7 = s6.stream().filter(n-> n.contains("A")).collect(Collectors.toList());
System.out.println(s7);

// filter all strings whoe length is greater than 5 from a list of string
List<String> s8 = s7.stream().filter(n-> n.length()>5).collect(Collectors.toList());
System.out.println(s8);

// to filter numbers divisible by 3 from a list of integers

List<Integer> l11 = l7.stream().filter(n -> n % 3 == 0).collect(Collectors.toList());
System.out.println(l11);

// convert a list of lowercase strings into uppercae strings using map
List<String> s9 = List.of("apple","boy","cat");
List<String> s10 = s9.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
System.out.println(s10);

// add 10 to each element of a list using map
List<Integer> l12 = l7.stream().map(n-> n+10).collect(Collectors.toList());
System.out.println(l12);

// find the length of each string oa list using map
List<String> s11 = List.of("APPLE","BOY","CAT");
List<Integer> s12 = s11.stream().map(n-> n.length()).collect(Collectors.toList());
System.out.println(s12);

// replace all negative numbers with 0 using map
List<Integer> list = List.of(34, -90, 34, 23, -9);
List<Integer> result = list.stream().map(n -> n < 0 ? 0 : n).collect(Collectors.toList());
System.out.println(result);

// EXTRACT THE FIRST CHARACTER FROM EACH STRING USING MAP()
List<String> list1 = List.of("Ram", "Shyam", "Sita");
List<Character> result1 = list1.stream().map(n -> n.charAt(0)).collect(Collectors.toList());
System.out.println(result1);

//CONVERT EACH NUMBER INTO IST SQUARE
List<Integer> l15 = List.of(2, 3, 4);
List<Integer> l16 = l15.stream().map(n -> n * n).collect(Collectors.toList());
System.out.println(l16);

//CREATE A NEW LIST WHERE EACH ELEMENT IS DOUBLED
List<Integer> l17 = List.of(5, 10, 15);
List<Integer> l18 = l17.stream().map(n -> n * 2).collect(Collectors.toList());
System.out.println(l18);

// filter numbers greater than 20 from a list and mutiply each number by 3 using map
List<Integer> l19 = List.of(10, 25, 30, 15, 40);
List<Integer> l20 = l19.stream() .filter(n -> n > 20).map(n -> n * 3).collect(Collectors.toList());
System.out.println(l2);

// filter strings whose length is greater than 4 and convert them to uppercase  using map
List<String> l21 = List.of("apple", "boy", "mango", "cat");
List<String> l22 = l21.stream().filter(n -> n.length() > 4).map(n -> n.toUpperCase()).collect(Collectors.toList());
System.out.println(l22);


	}
	
}
