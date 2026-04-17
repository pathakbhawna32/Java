import java.util.*;

public class soretdd {

	public static void main(String[] args) {
		
		List<Integer> l1 = List.of(34,56,23,56,89,12);
    
    // By default sort array into ascending order
    List<Integer>  l2 = l1.stream().sorted().toList(); 
    System.out.println(l2);
    
    // Second method to sort in ascending order using compareTO
    List<Integer>  l3 = l1.stream().sorted((x,y)->x.compareTo(y)).toList(); 
    System.out.println(l3);
    
    // First method to sort in descending order using comparator
    List<Integer>  l4 = l1.stream().sorted(Comparator.reverseOrder()).toList(); 
    System.out.println(l3);
    
    // Second method to sort in descending order using compareTO
    List<Integer>  l5 = l1.stream().sorted((x,y)->y.compareTo(x)).toList(); 
    System.out.println(l5);
	
	}

}
