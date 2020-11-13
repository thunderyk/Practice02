package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double first_num,second_num, result;
		String inequality;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		inequality = sc.nextLine();
		System.out.print("숫자1: ");
		first_num = sc.nextDouble();
		System.out.print("숫자2: ");
		second_num = sc.nextDouble();
		
		/*
		//if문을 사용할 때 문자열 비교
		if(inequality.equals("+")) {
			result = first_num+second_num;
			System.out.println("결과는: "+result );
		}else if(inequality.equals("-")) {
			result = first_num-second_num;
			System.out.println("결과는: "+result );
		}else if(inequality.equals("/")) {
			if(second_num<=0) {
				System.out.println("계산할 수 없습니다.");
			}else {
				result = first_num/second_num;
				System.out.println("결과는: "+result );
			}
		}else if(inequality.equals("*")) {
			result = first_num*second_num;
			System.out.println("결과는: "+result );
		}else {
			System.out.println("계산할 수 없는 기호입니다.");
		}*/
		
		switch(inequality) {
			case "+":
				result = first_num+second_num;
				System.out.println("결과는: "+result );
				break;
			case "-":
				result = first_num-second_num;
				System.out.println("결과는: "+result );
				break;
			case "/":
				if(second_num<=0) {
					System.out.println("계산할 수 없습니다.");
				}else {
					result = first_num/second_num;
					System.out.println("결과는: "+result );
				}
				break;
			case "*":
				result = first_num*second_num;
				System.out.println("결과는: "+result );
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
	}

}
