package JavaSessions;

public class Person {

	String name;
	int age;
	char gender;

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Kiran";
		p1.age = 30;
		p1.gender = 'm';

		Person p2 = new Person();
		p2.name = "Priya";
		p2.age = 40;
		p2.gender = 'f';

		Person p3 = new Person();
		p3.name = "Ali";
		p3.age = 35;
		p3.gender = 'm';
		
		System.out.println(p1.name + " " + p1.age + " " + p1.gender );
		System.out.println(p2.name + " " + p2.age + " " + p2.gender );
		System.out.println(p3.name + " " + p3.age + " " + p3.gender );
		
		p1 = p2;
		p2 = p3;
		
		System.out.println(p1.name + " " + p1.age + " " + p1.gender );
		System.out.println(p2.name + " " + p2.age + " " + p2.gender );
		System.out.println(p3.name + " " + p3.age + " " + p3.gender );
		
		p3 = p1;
		System.out.println(p1.name + " " + p1.age + " " + p1.gender );
		System.out.println(p2.name + " " + p2.age + " " + p2.gender );
		System.out.println(p3.name + " " + p3.age + " " + p3.gender );

	}

}
