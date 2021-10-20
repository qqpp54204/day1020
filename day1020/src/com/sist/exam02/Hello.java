package com.sist.exam02;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string;
		System.out.println("문자를 입력하세요.");
		string = sc.next();
		string.replace("안녕", "hello");
		System.out.println(string);
		
	}

}
