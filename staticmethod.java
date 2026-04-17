// STATIC METHOD - IT CONTAINS COPLETE IMPLEMENTATION & BELONGS ONLY TO THR INTERFACE NOT TO THE IMPLEMENTING CLASS
// WE CAN CREATE MULTIPLE STATIC AND DEFAULT METHOD IN NORMAL AND INTERFCAE AND ONLY ONE IN FUNCTIONAL INTERFACE
//used to add new functionality or helper method

interface int5{
	static int add(int x, int y) { // Static method with interface 
	     return x+y;	
		}
}
public class stat  {
    
	public static void main(String[] args) {
      int result  = int5.add(10,20); // calling static method , we does not create object
         System.out.println(result);
	}

}
