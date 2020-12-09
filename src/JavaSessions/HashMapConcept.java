package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		
		//Collection -- dynamic
		//stores the values : key-value pair
		//can have only one null key
		//can have any number of null values
		
		Map<String, String> EmpMap = new HashMap<String, String>();
		
		EmpMap.put("name", "Tom");
		EmpMap.put("ID", "101");
		EmpMap.put("city", "Bangalore");
		EmpMap.put("country", "IN");
		EmpMap.put(null, "1000");
		EmpMap.put(null, "2000");
		EmpMap.put("age", null);
		EmpMap.put("phone", null);
		EmpMap.put("country", "UK");
		
		
		System.out.println(EmpMap.get("name"));
		System.out.println(EmpMap.get("country"));
		System.out.println(EmpMap.get("salary"));//null

		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get("age"));
		
		//entrySet: to fetch all keys-values:
		for(Map.Entry<String, String> entry : EmpMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() +  " value = " + entry.getValue());
		}

		System.out.println("----");
		
		//keySet(): for getting the keys:
		for(String s : EmpMap.keySet()) {
			System.out.println("key = " + s);
		}
		
		System.out.println("----");

		
		//values(): for getting the values:
		for(String v: EmpMap.values()) {
			System.out.println("value = " + v);
		}
		System.out.println("----");

		
		//Lambda:
		EmpMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
		
		
		
	}

}
