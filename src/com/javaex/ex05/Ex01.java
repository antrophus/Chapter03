package com.javaex.ex05;

public class Ex01 {
	
	public static void main(String[] args) {
		
		String s01 = "안녕하세요";
		System.out.println("안녕하세요");
		System.out.println(s01);
		System.out.println("------------------");
		String s00 = new String("안녕하세요");
		System.out.println(s00.toString());
		
		System.out.println("------------------");
		System.out.println(s00.hashCode());
		System.out.println(s01.hashCode());
		
	}

}
