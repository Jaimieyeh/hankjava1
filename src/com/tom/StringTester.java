package com.tom;

public class StringTester {

	public static void main(String[] args) {
		String s = "Hello World";
// 					01234567890
		System.out.print(s.substring(7));
		System.out.println();
		System.out.print(s.substring(0, 5));
		/*for (int i = s.length() - 1; i>=0; i--){
			System.out.print(s.charAt(i));*/
		System.out.println();	
		String s2 = new String("Jack Tom Eric");
//								0123456789012
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0, index) + "boss" + s2.substring(index+name.length()));
		System.out.print(s2.substring(0, 5) + "boss" + s2.substring(8, 13));
		
		int a = Integer.parseInt("18");
		a--;
		System.out.println(a);
		float b = float.praseFloat("10.5");
		
		
		}
	}


