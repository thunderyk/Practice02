package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sabun, team_amount = 3;

		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		sabun = sc.nextInt();

		if (sabun < 0) {
			System.out.println("잘못입력하셨습니다.");
		}else if (sabun % team_amount == 0) {
			System.out.println("A팀입니다.");
		}else if (sabun % team_amount == 1) {
			System.out.println("B팀입니다.");
		}else if (sabun % team_amount == 2) {
			System.out.println("C팀입니다.");
		}
		sc.close();
	}

}
