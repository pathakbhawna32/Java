// DISTINCT METHOD - remove duplicate elements from set
	// firts covert into string


	import java.util.List;

	public class distinctmethod {

		public static void main(String[] args) {
			
			// List banayi hai jisme kuch duplicate values bhi hain
			List<Integer> l1 = List.of(10, 30, 4, 56, 10, 6, 34, 30, 6);
			
			// stream() -> list ko stream me convert karta hai
			// distinct() -> duplicate elements hata deta hai
			// forEach() -> har element ko ek ek karke print karta hai
			l1.stream().distinct().forEach(System.out::println);
			List<Integer> l2 = l1.stream().distinct().toList();
			// l1.stream()  -> list ko stream me convert karta hai
			// distinct()   -> duplicate values remove karta hai
			// toList()     -> stream ke result ko wapas ek new List me convert karta hai

			System.out.println(l2);
			// new list l2 ko print karega
		}
	}
