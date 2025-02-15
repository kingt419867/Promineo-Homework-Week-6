package week6LabsAndHomework;

public class Week6Apps {

	public static void main(String[] args) {

//		if (true && 1 == 1) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		
//		int i = 0;
//
//		while (i < 10) {
//
//		  System.out.println(i);
//
//		}
	
//public boolean foundT(String word) {
//	return (word.toLowerCase().contains("t"))
//}
	
	//public static void doSomething(int a, int b) {}
	//public static int doSomething(int a, int b) {}
	//public static double doSomething(int a, int b) {}
	
//	String a = "14";
//	String b = "15";
//	String c = "14";
//	if (a == a) {
//		System.out.println(true);
//	} else {
//		System.out.println(false);
//	}
//	
//	if (true || false) {
//		System.out.println(true);
//	} else {
//		System.out.println(false);
//	}
		
		//public static int addIntegers(int a, int b) { int sum = a + b; }
		
//		String object = new String("test");
//		String object2 = new String("test");
//		if (object.equals(object2)) {
//		System.out.println(true);
//	} else {
//		System.out.println(false);
//	}
//		
//		int[] myNumbers = new int[5];
		
//		for (int i = 0; i < 101; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
//	System.out.println(multiply(4,6));	
//		System.out.println(multiplyName("Dave", 6));
		
		System.out.println(createStringCount(4));
		
		
} // main
//	public static int multiply(int a, int b) {
//		return a * b;
//	}
//	public static String multiplyName(String name, int times) {
//		String answer = "";
//		for (int i=0; i <times; i++) {
//			answer += name;
//			System.out.println(i);
//		}
//		return answer;
//	}
	
	public static String createStringCount(int a) {
		StringBuilder sb = new StringBuilder();
		for (int i = a; i >= 0; i--) {
			sb.append(i);
		} // for
		return sb.toString();
	} // method
	
} // class
