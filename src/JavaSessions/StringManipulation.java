package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		
		String str = "Hello This is my first java code and I am so happy";
		
		System.out.println(str.length());//44
		System.out.println("Li=" + 0);
		System.out.println("Hi = " + (str.length()-1));
		
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(43));
		//System.out.println(str.charAt(44));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("i"));//1st occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i")+1)); //2nd occurrence of i
		
		System.out.println(str.indexOf("java"));//23
		System.out.println(str.indexOf("naveen"));//-1
		
		String messg = "welcome naveen";
		if(messg.indexOf("naveen") == 8) {
			System.out.println("correct welcome mesg");
		}
		else {
			System.out.println("in correct welcome mesg");
		}
		
		//trim:
		String s = "    hello world    ";
		System.out.println(s.trim());
		
		//replace:
		System.out.println(s.trim().replace(" ", ""));
		
		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//upper/lower cases:
		String s1 = "this is my java code";
		System.out.println(s1.toUpperCase());
		
		String s2 = "HELLO WELCOME TO TESTING WORLD";
		System.out.println(s2.toLowerCase());
		
		//contains:
		String s3 = "Your browser is chrome";
		System.out.println(s3.contains("chrome"));//true
		
		String browser = "chrome";
		if(browser.contains("chrome")) {
			System.out.println("launch chrome browser");
		}
		
		//String Comparisons:
		//.equals()
		
		System.out.println(browser.equals("chrome"));
		System.out.println(browser.equalsIgnoreCase("chrome"));
		
		String f1 = "Hello World";
		String f2 = "Hello World ";
		System.out.println(f1.equals(f2));
		System.out.println(f1.equalsIgnoreCase(f2));
		System.out.println(f1.equalsIgnoreCase(f2.trim()));
		
		
		System.out.println(f1.concat(f2));
		System.out.println(f1+f2);
		
		//split:
		String lang = "Java;Python;JavaScript;Ruby";
		
		String language[] = lang.split(";");
		
		System.out.println(language.length);
		System.out.println(language[0]);
		
		for(String ele : language) {
			System.out.println(ele);
		}
		
		System.out.println("----");
		
		for(int i=0; i<language.length; i++) {
			System.out.println(language[i]);
		}
		
		System.out.println("----");

		
		String empData = "Neha;Kashyap25;London;UK;98900;IBM";
		String emp[] = empData.split(";");
		for(String ele : emp) {
			System.out.println(ele);
		}
		
		String test = "xXtestingxXXSeleniumXxXCucumber";
		String tester[] = test.split("xX");
		System.out.println("0th--->" + tester[0]);
		System.out.println("1st--->" + tester[1]);
		System.out.println("2nd--->" + tester[2]);
		System.out.println("3rd--->" + tester[3]);

		//SubString:
		String main = "Your total amount is 3000";
		System.out.println(main.substring(5));
		System.out.println(main.substring(5, 12));
		
		System.out.println(main.substring(main.indexOf("is")+3, main.length()));
		
		System.out.println(main.substring(main.indexOf("is")+3));
		
		String amount = main.substring(main.indexOf("is")+3, main.length());
		System.out.println(amount+50+10);//30005010
		System.out.println(amount+(50+10));//300060
		//3060
		
		//String to int: using ParseInt from Integer class:
		int amountVal = Integer.parseInt(amount); //3000
		System.out.println(amountVal + 50 + 10);

		//String enroll = "Your transaction id is 12345 please enroll";
		
				
	}

}
