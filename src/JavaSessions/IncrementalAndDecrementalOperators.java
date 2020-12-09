package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {


		//System.out.println("hello " + ('a' + 'b'));

		//1. post increment: ++
		int a = 1;
		int b = a++; //post increment
		System.out.println(a);//2 
		System.out.println(b);//1
		
		int m = -1;
		int n = m++; //post increment
		
		System.out.println(m);//0
		System.out.println(n);//-1
		
		//2. pre increment:
		int p = 1;
		int q = ++p; //pre increment
		System.out.println(p);//2
		System.out.println(q);//2
		
		int c = -99;
		int d = ++c;
		System.out.println(c);//-98
		System.out.println(d);//-98
		
		//3. post decrement: --
		int r = 2;
		int e = r--; //post decrement
		System.out.println(r);//1
		System.out.println(e);//2
		
		//4. pre decrement:
		int s = 2;
		int f = --s; 
		System.out.println(s);//1
		System.out.println(f);//1
		
		int v = 2;
		System.out.println(v++);
		System.out.println(v);
		
		
		
	}

}
