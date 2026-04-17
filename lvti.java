// LOCAL VARIABLE TYPE INFERENCE


class Test2{
	Test2() {   //  INSIDE CONSTRUCTOR
		var x = 23;
		System.out.println(x);	
	}
	void check() {   //  INSIDE METHOD
		var s = "hello";
		System.out.println(s);		
	}
}


public class LVTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test2 t = new Test2();
          t.check();
          
          for(var i = 0; i<=4; i++) { // INSIDE BLOCK OR LOOP
        	  System.out.println(i);	
          }
	}

}
//IF WE WANT TO USE AS A RETURN VALUE IN METHOD
// String check() {
// var s = "hello";
// return s;
