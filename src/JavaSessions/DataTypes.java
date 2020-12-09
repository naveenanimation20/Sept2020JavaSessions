package JavaSessions;

/**
 * This class is about data types in Java
 * @author NaveenKhunteta
 *
 */
public class DataTypes {

	public static void main(String[] args) {

		//this is my 
		//first 
		//java code
		
		/*this is data  types
		 * and im so happy
		 */
		
		
		//data  types:
		//Integer Family: byte, short, int, long
		//Floating family: float, double
		//character: char
		//boolean : true and false
		//String:
		
		//1. byte: 
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b  = 10;
		byte b1 = 20;
		byte b2 = 0;
		byte b3 = -30;
		
		System.out.println(b);
		System.out.println(b3);
		System.out.println(b+b1+b3);
		
		//2. short:
		//size: 2 bytes: 16 bits
		//range: -32768 to 32767
		short s1 = 10;
		short s2 = -1000;
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 10;
		int total = 20000;
		
		//4. long:
		//size: 8  bytes = 64 bits
		//range: will check it
		long l = 232323232;
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range : around 7 digits after .
		float f = 12.33f;
		float f1 = (float)23.44;
		float f3 = 100;//100.0
		System.out.println(f+10);
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: upto 15 digits after .
		double d = 12.33;
		double d1 = -34.5555;
		
		//7. char:
		//size: 2 bytes
		char c = 'a';
		char c11 = 'b';
		char c1 = '1';
		char c2 = '$';
		
		System.out.println(c);
		System.out.println(c+c11);//97+98 = 195
		//a-z --> 97-122
		//A-Z --> 65 - 90
		//0-9 --> 48 - 57
		
		
		//8. boolean:
		//size: ~ 1 bit
		boolean flag = true;
		boolean test = false;

		//9. String: is not a data type, its a class
		String str = "hello world";
		System.out.println(str);
		
		String st1 = "100";
		System.out.println(st1+str);
		
		System.out.println(1000);
		System.out.println("hello selenium");
		System.out.println(10+20);
		System.out.println("testing" + 100);
		System.out.println("hello" + " "+ "world");
		
		System.out.print(80+"\n");
		System.out.println(60);
		
		//System.err.println("some error is coming....");
		
		System.out.println(4/2);
		System.out.println(9 % 2);
		
		byte bbb = 065;
		System.out.println(bbb);
		
		//65 = (6 × 8¹) + (5 × 8⁰) = 53
		
		
	}

}
