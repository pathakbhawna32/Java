// Student class
class Studentttt5 {
	int id;
	String name;

	// Constructor to initialize student id and name
	Studentttt5(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class questionsoffiltermap {

	public static void main(String[] args) {

		// Create a list of Student objects
		List<Studentttt5> stud = Arrays.asList(
				new Studentttt5(1, "xyz"),
				new Studentttt5(2, "abc"),
				new Studentttt5(3, "pqr")
		);

		// Use map() to extract only student names from Student objects
		// collect() is used to store the names into a new List
		List<String> names = stud.stream().map(s -> s.name).collect(Collectors.toList());

		// Print the list of names
		System.out.println(names);
	}
}
