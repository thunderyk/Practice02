package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int first_num,second_num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		first_num = sc.nextInt();
		System.out.print("두번째 숫자: ");
		second_num = sc.nextInt();
		
		if(first_num <= second_num) {
			if(first_num % second_num == 0) {
				System.out.println(first_num+"는(은) "+second_num+" 의 약수입니다.");
			}else {
				System.out.println(first_num+"는(은) "+second_num+" 의 약수가 아닙니다.");
			}
		}else {
			if(second_num % first_num == 0) {
				System.out.println(second_num+"는(은) "+first_num+" 의 약수입니다.");
			}else {
				System.out.println(second_num+"는(은) "+first_num+" 의 약수가 아닙니다.");
			}
		}
		
		sc.close();
	}

}
