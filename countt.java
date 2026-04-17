//count() - List me kitne elements hain, wo batata hai
import java.util.List;

public class coutnmethid {

	public static void main(String[] args) {
		
		// List banayi hai
		List<Integer> l1 = List.of(10, 30, 4, 56, 10, 6, 34, 30, 6);
		
		// stream() -> list ko stream me convert karta hai
		// count()  -> total number of elements count karta hai
		long count = l1.stream().count();

		// Total elements print karega
		System.out.println(count);
	}
}
