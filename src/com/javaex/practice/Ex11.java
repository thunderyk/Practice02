package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char char_alpa;
		String String_alpa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========알파벳을 char형으로 받음==========");
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		char_alpa = sc.next().charAt(0);
		sc.nextLine();
			
		/*
		switch(char_alpa) {
		
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
		}
		//안좋지만 짧음 권장X
		*/
		switch(char_alpa) {
		
			case 'a':
				System.out.println("모음입니다.");
				break;
			case 'e':
				System.out.println("모음입니다.");
				break;
			case 'i':
				System.out.println("모음입니다.");
				break;
			case 'o':
				System.out.println("모음입니다.");
				break;
			case 'u':
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
		}
		System.out.println("==========알파벳을 String형으로 받음==========");
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String_alpa = sc.nextLine();
		/*
		switch(String_alpa) {
		
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
		}
		*/
		switch(String_alpa) {		
			case "a":
				System.out.println("모음입니다.");
				break;
			case "e":
				System.out.println("모음입니다.");
				break;
			case "i":
				System.out.println("모음입니다.");
				break;
			case "o":
				System.out.println("모음입니다.");
				break;
			case "u":
				System.out.println("모음입니다.");
				break;
			default:
				System.out.println("자음입니다.");
				break;
		}
		
		sc.close();
	}

}
