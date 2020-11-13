package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_num, second_num, third_num;

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		first_num = sc.nextInt();
		System.out.print("숫자2: ");
		second_num = sc.nextInt();
		System.out.print("숫자3: ");
		third_num = sc.nextInt();

		if (first_num <= second_num && first_num <= third_num) {
			System.out.println("가장 작은 수는 "+first_num+"입니다.");
		}else if(second_num <= first_num && second_num <= third_num){
			System.out.println("가장 작은 수는 "+second_num+"입니다.");
		}else if(third_num <= first_num && third_num <= second_num) {
			System.out.println("가장 작은 수는 "+third_num+"입니다.");
		}
		
		sc.close();
		
		//같다는 혹시 같은 수가 들어갈 경우를 대비해서 넣음.
	}

}
