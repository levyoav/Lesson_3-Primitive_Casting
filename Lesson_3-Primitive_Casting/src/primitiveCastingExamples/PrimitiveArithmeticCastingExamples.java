package primitiveCastingExamples;


public class PrimitiveArithmeticCastingExamples {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101) + 300; //Randomise an int number between 300-400.
		int b = (int) (Math.random() * 101); //Randomise an int number between 1-100.

		System.out.println("a = " + a + ", b = " + b);
		
		//The arithmetic expression a/b consist of 2 int values a and b. The result may not be an integer number
		//(float, double..). But since the expression consists only of int values, by default the result of the expression 
		//is of type int and some data may be lost. Since double is a larger type than an int, casting one of the int 
		//values to double makes the result of the arithmetic expression (a/b) to a double type. 
		double res1 = (double) a / b;
		
		//In this case, no casting is done on the side of the arithmetic expression, so the result is necessarily of type int.
		//But since res4 is of type double it will hold the result, which is int, in a double form. Meaning, with a decimal point
		//and a 0 after the decimal point.
		double res4 = a / b;
		
		//Both of the sections are int so there may be data loss from the division.
		int res2 = a / b;
		int res3 = a % b; //The type of the result is int. See at the end how I found out...
		

		System.out.println(a + " / " + b + " = " + res1);
		System.out.println(a + " % " + b + " = " + res4);
		System.out.println(a + " / " + b + " = " + res2);
		System.out.println(a + " % " + b + " = " + res3);

		// ////////////////////

		System.out.println();
		
		//x and y represent int numbers in a double form.
		double x = a;
		double y = b;
		
		System.out.println("x = " + x + ", y = " + y);
		
		res1 = x / y; //Both sections are of type double. No data loss.
		
		//Must have explicit casting here since res2 is an int and the expression x/y is a double. There may be data loss. 
		res2 = (int) (x / y);
		res3 = a % b;
		
		System.out.println(a + " / " + b + " = " + res1);
		System.out.println(a + " / " + b + " = " + res2);
		System.out.println(a + " % " + b + " = " + res3);
		
		//I was'nt sure what was the type of the expression a % b. So I wanted to use the getClass() method. I could'nt use it on
		// the expression itself, so I had to assign the result of the expression to an object. Since I don't know the type of the
		//Expression, I used polymorphism and created an object of type Object.
		Object obj = new Object();
		System.out.println(obj.getClass().getName()); //java.lang.Object is printed.
		
		//By assigning the result of the expression to obj, it became the WRAPPER type of the result (Integer). 
		obj = a % b;
		System.out.println(obj.getClass().getName()); //java.lang.Integer is printed.
		
		//Same for double values (Double).
		obj = x % y;
		System.out.println(obj.getClass().getName()); //java.lang.Double is printed.

	}

}
