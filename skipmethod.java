	import java.util.List;

public class skipmethod {

	public static void main(String[] args) {
		
		// List banayi hai
		List<Integer> l1 = List.of(10, 30, 4, 56, 10, 6, 34, 30, 6);
		
		// stream() -> list ko stream me convert karta hai
		// skip(3)  -> first 3 elements ko chhod deta hai
		// toList() -> remaining elements ko new list me convert karta hai
		List<Integer> l2 = l1.stream().skip(3).toList();

		// New list print karega
		System.out.println(l2);
	}
}
