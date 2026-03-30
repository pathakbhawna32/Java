// Reference to static method
//Reference to Instance/non static method method
// reference to an instance method of an Arbitary object
// Reference to constructor

interface int1 {
	void show();  
}
class Demo {                                  // class for reference
	public static void display() {           // static method
		System.out.println("reference to static method");
	}
}

public class Methoddrefrence {
	public static void main(String[] args) {
		Demo d = new Demo();                 //reference to non static method or instance method we have to create object
		int1 i1 = Demo::display;             // call  static method reference
		i1.show();

	}
