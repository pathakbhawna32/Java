// DEFAULT METHOD WITH INTERFACE
//used to add new functionality without breaking the existing code
interface int1{
	//void show();
	default void def1() { // default method inside interface
		System.out.println("Default method inside interface1");	
		}
}
interface int2{
	default void def1() {
		System.out.println("Default method inside interface2");	
		}
}
public class def implements int1,int2 {
     public void def1() { // overriding the method for solving the conflict of multiple inheritance
    	int1.super.def1(); //call method for int1
    	int2.super.def1(); //call method for int2
     }
	public static void main(String[] args) {
         def d = new def();
         d.def1(); // calling default method
	}

}
