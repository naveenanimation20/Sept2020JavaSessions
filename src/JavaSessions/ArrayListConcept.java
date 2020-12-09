package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList is a default class in Java
		//dynamic array
		//order based/index based arraylist/collection
		//Li = 0
		//Hi = size -1
		//size = ar.size()
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());

		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		//ar.remove(6);//700
		
		System.out.println(ar.size());//7
		
		ar.add(800);//7
		System.out.println(ar.get(6));

		ar.add(900);//8
		ar.add(1000);//9

		System.out.println(ar.size());//10

		ar.add(1100);
		
		ar.add(12.33);
		ar.add(true);
		ar.add('f');
		ar.add("tom");
		
		//to print all the values from arraylist: for loop:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//array list with integer:
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<String> countryList = new ArrayList<String>();
		countryList.add("India");//0
		countryList.add("UK");
		countryList.add("USA");
		countryList.add("Germany");//3
		
		System.out.println(countryList.size());
		System.out.println(countryList.get(0));
		//System.out.println(countryList.get(4));
		
		for(int i=0; i<countryList.size(); i++){
			System.out.println(countryList.get(i));
		}

		//for each:
		for(String s : countryList){
			System.out.println(s);
		}
		System.out.println("------");
		
		//Java Streams also: JDK8
		countryList.stream().forEach(ele -> System.out.println(ele));
		

		//store a list with different types of data: emp data
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");
		empDataList.add(25);
		empDataList.add('m');
		empDataList.add(true);
		empDataList.add(34.55);
		
		empDataList.stream().forEach(data -> System.out.println(data));
		
	}

}
