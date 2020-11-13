package com.javaex.practice;

public class Ex01 {

	public static void main(String[]args) {
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		/*
		if(0 < age < 18) {
			System.out.println("청소년 입니다.");
		}
		*/
		// ==>
		if( 18 > age && age > 0) {
			System.out.println("청소년 입니다.");
		}
		//나이가 0초과 18미만 작은 것을 둘 다 만족해야 하기 때문에 && 사용
	}
}
