package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_num,second_num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		first_num = sc.nextInt();
		System.out.print("숫자2: ");
		second_num = sc.nextInt();
		
		if(first_num>=second_num) {
			System.out.println("큰수: "+first_num+"           "+"작은수: "+second_num+"입니다.");
		}else {
			System.out.println("큰수: "+second_num+"           "+"작은수: "+first_num+"입니다.");
		}
		
		sc.close();
	}

}
