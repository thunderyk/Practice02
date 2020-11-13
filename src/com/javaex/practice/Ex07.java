package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_num,second_num,portion,rest;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		first_num = sc.nextInt();
		System.out.print("두번째 숫자: ");
		second_num = sc.nextInt();
		
		if(first_num >= second_num) {
			portion = first_num / second_num;
			rest = first_num % second_num;
		}else {
			portion = second_num / first_num;
			rest = second_num % first_num;
		}
		System.out.println("몫: "+portion);
		System.out.println("나머지: "+rest);
		
		sc.close();
	}

}
