import java.util.List;

public class firstthreevennumber{

	public static void main(String[] args) {
		
		// List banayi hai
		List<Integer> l1 = List.of(10, 30, 4, 56, 10, 6, 34, 30, 6);
		
		// filter() -> sirf even numbers lega
		// limit(3) -> unme se first 3 even numbers lega
		// forEach() -> ek ek karke print karega
		l1.stream().filter(n -> n % 2 == 0).limit(3).forEach(System.out::println);
	}
}
