package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		// Object Class -> 모든 클래스의 최상위 클래스
		// 명시적인 상속 선언 없이도 자동 상속
		Object obj = new Object();
		Object obj2 = new Object();
		
		//int hc = obj.hashCode();
		//당분간은 주소라고 생각하자
		
		System.out.println(obj.getClass()); // 클래스 정보
		System.out.println(obj.toString()); // java.lang.Object@327471b5
		System.out.println(obj.hashCode()); // 당분간은 주소라고 생각하자
		
		System.out.println(obj.equals(obj)); // 두개가 같냐? true or false
		

	}

}
