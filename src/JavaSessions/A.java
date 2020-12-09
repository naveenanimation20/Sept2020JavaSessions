package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A -- main method");
		
		B.main(args);//StackOverflowError
		
		
	}

}
