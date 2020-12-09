package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		
		//1 to 10:
		//loops:
		//1. while:
		
		int i = 1; //Initialization
		while(i<=10){ //Conditional
			System.out.println(i);//1 2 3 4 5 .... 10
			i++; //incremental/decremental
		}
		
		System.out.println("----------");
		
		//2. for loop:
		//1 to 10:
		for(int k=1; k<=10; k++){
			System.out.println(k);//1 2 3 4 5....10
		}
		
//		for( ; ; ){
//			System.out.println("Welcome to Taz Hotel");
//		}
		
		System.out.println("----------");

		//even numbers:  0 2 4 6 8 10 
		for(int even=0; even<=10; even=even+2){
			System.out.println(even);//0 2 4 6 8 10 
		}
		
		System.out.println("----------");

		//odd numbers: 1 3 5 7 9
		for(int odd=1; odd<10; odd=odd+2){
			System.out.println(odd);//1 3 5 7 9 
		}
		
		//
		for(int p=1; p<=10;){
			System.out.println(p);
			//p++;
			p=p+1;
		}
		System.out.println("----------");

		
		//
		for(int h=1; h<=100; h++){
			System.out.println(h);
			if(h % 5 == 0){
				System.out.println("hiiii");
			}
		}
		
		System.out.println("----------");
		
		//a to z:
		for(char c ='a' ; c<='z'; c++){
			System.out.println(c);
		}
		
		
		System.out.println("----------");

		for(byte b=1; b<=5; b++){
			System.out.println(b);
		}
		
		System.out.println("----------");

		for(double d=1.1; d<10; d++){
			System.out.println(d);
		}
		
		System.out.println("----------");
		
		for(String st = "hello"; st.equals("hello");){
			System.out.println(st);
			
		}
		
		System.out.println("----------");


		//3. do-while:
		int n = 1;
		do{
			System.out.println(n);//12345678910
			n++;
		}
		while(n<=10);
		
		
	}

}
