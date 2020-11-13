package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double height,weight;
		double average_weight;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키: ");
		height = sc.nextInt();
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		average_weight = (height - 100) * 0.9;
		if(average_weight < weight) {
			System.out.println("과체중 입니다.");
		}else if(average_weight == weight) {
			System.out.println("평균체중 입니다.");
		}else {
			System.out.println("저체중 입니다.");
		}
		System.out.println("표준체중: "+average_weight);
		
		sc.close();
	}

}
