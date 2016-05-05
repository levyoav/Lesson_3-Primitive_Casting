package primitiveCastingExamples;

public class PrimitiveCastingExamples {

	public static void main(String[] args) {

		int n1 = 10;
		
		//Implicit casting - The int value that is stored in n1 is being implicitly casted to long
		//and assigned to n2. This is implicit due to the assignment of n1 to a larger type n2. n2 itself
		//is still of type long, but it was assigned an int value that was casted to long. Since a smaller
		//type (int) was casted to a larger type (long) there was no data loss.
		long n2 = n1;
		System.out.println(n2); //10 is printed, not 3.
		
		//Explicit casting - The long value that is stored in n2 is being explicitly casted to int and
		//assigned to n3. Since the casting is done from a larger type (long) to a smaller type (int) there
		//may be a data loss. If there was no explicit casting (like in the following commented line) there 
		//would be a type mismatch, since implicit casting from a larger type to a smaller type is forbidden
		//due to possible data loss.  
		int n3 = (int) n2; 
//		int n3 = n2; 
		System.out.println(n3);
		
		//The value assigned to f1 has to have the F suffix, since a decimal number is by default of type 
		//double and f1 is set to be float, which is a smaller type than a double. If there was no suffix (like 
		//in the following commented line) there would be a type mismatch.
		float f1 = 7.36F;
//		float f1 = 7.36;
		
		//Explicit casting - The float value 7.36 stored in f1 is being casted to an int value of 7. There is 
		//a data loss. f1 is not changed due to the casting.
		int x = (int) f1;
		
		System.out.println(f1); //7.36 is printed.
		System.out.println(x); //7 is printed since there was a trimming of the decimal value due to the casting 
		
		int y = 128; //128 = 10000000B = -128 in 2's complement.
		
		//Explicit casting - int is the size of 32 bit. byte is the size of 8 bit. Thus, there might be data loss
		//of the integer value. Since byte is an 8 bit integer, it ranges from 127 (011111111B in 2's complement) to
		//-128 (10000000B in 2's complement). So the binary representation of 128 as an int, is calculated as -128 in
		//2's complement for a byte type.
		byte b1 = (byte) y;
		
		System.out.println(y); //128 is printed.
		System.out.println(b1); //-128 is printed.
	}

}
