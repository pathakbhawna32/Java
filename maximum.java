import java.util.*;

public class maximumm {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	List<Integer> l1 = List.of(10,34,56,23,56,12);
	int maximum = l1.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println(maximum);

		}

	}
