package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.print("\"1번그룹\"");
		}else {
			System.out.print("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		//15를 넣으면 2번그룹
		//19를 넣으면 2번그룹
		//20를 넣으면 2번그룹
		//21를 넣으면 1번그룹
		//100를 넣으면 1번그룹
	}

}
