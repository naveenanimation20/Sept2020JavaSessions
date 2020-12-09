package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//two major limitations of array:
		//1. static arrays -- size is fixed -- to overcome this issue, we use dynamic arrays (ArrayList)
		//2. it stores only similar types of data -- to overcome this issue, we can use Object static Array and ArrayList
		
		//int array:
		int i[] = new int[4];
		
		//i[-1] = 60;
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50; //ArrayIndexOutOfBoundsException
		
		System.out.println("li = " + 0);
		System.out.println(i.length);
		System.out.println("hi = " + (i.length-1));
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		int l = i.length;//4
		
		//to print all the values from array: use for loop:
		for(int p=0; p<l; p++){
			System.out.println(i[p]);//10 20 30 40
		}
		
		//for each loop:
		for(Integer k : i){
			System.out.println(k);
		}
		
		
		//2. double array:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=100;
		
		System.out.println(d.length);
		
		//3. char array:
		char c[] = new char[3];
		
		//4. String array:
		String student[] = new String[3];
		student[0]="Tom";
		student[1]="Ali";
		student[2]="Priya";
		//student[3]="naveen";

		System.out.println(student[0]);
		
		for(int h=0; h<student.length; h++){
			System.out.println(student[h]);
		}
		
		for(String h : student){
			System.out.println(h);
		}
		
		
		//5. Object static Array
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = 'm';
		ob[4] = true;
		
		for(int h=0; h<ob.length; h++){
			System.out.println(ob[h]);
		}
		
		for(Object h : ob){
			System.out.println(h);
		}
		
	}

}
