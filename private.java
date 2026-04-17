// PRIVATE METHOD INSIDE THE INTERFACE -IT CAN USED ONLY INSIDE THE INTERFACE & WE CAN CREATE DEFAULT AND STATIC METHOD INSIDE THE INTERFACE AND CALL IT USING THE 
// does not need to call check balance method repeatedly
// write a program that demonstrates multiple inheritance.
interface int8{
	private void checkbalance() {
		System.out.println("Checking Balance");
	}
	default void deposit() {
		System.out.println("money deposited");
		checkbalance();
	}
}

public class privaate implements int8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          privaate p = new privaate();
          p.deposit();
	}

}
