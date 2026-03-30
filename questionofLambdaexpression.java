// WRITE A JAVA PROGRAM USING A LAMBDA EXPRESSION TO COMPARE TWO INTEGERS AND RETURN THE GREATER NUMBER


interface Greater{
int findgreater(int x, int y);
		
	}
public class lambdaexpressionquestions {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
	Greater m = (a, b) -> (a > b) ? a : b;
		int result = m.findgreater(num1, num2);

        System.out.println("Greater number is: " + result);
    }


	}



