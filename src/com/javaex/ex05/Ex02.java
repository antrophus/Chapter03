package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg");
		
		System.out.println(a.concat(b)); //a의 문자열과 b의 문자열을 합쳐줌.
		System.out.println(a+b);
		
		System.out.println(b.concat(a));
		System.out.println(b+a);
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println("-----------------------------------");
		
		String str = "Hello JAVA!";
		String result01 =str.substring(3);
		System.out.println(result01);
		String result02 = str.substring(1, 7);
		System.out.println(result02);
		
		System.out.println("-----------------------------------------------");
		char result03 = str.charAt(8);
		System.out.println(result03);
		
		System.out.println("=====================================================");
		
		String s00 = new String("안녕하세요");
		String s01 = new String("안녕하세요");
		System.out.println( s00==s01 );
		
		String s03 = "안녕";
		String s04 = "안녕";
		System.out.println( s03==s04 );
		
		s03 = "안녕!";
		System.out.println( s03==s04);
		System.out.println("=====================================================");
		
		System.out.println( s00.equals(s01));
		
		s04 =  null;
		
		/*
		  
		 */

	}

}
