package com.sist.exam02;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String string;
		System.out.println("���ڸ� �Է��ϼ���.");
		string = sc.next();
		string.replace("�ȳ�", "hello");
		System.out.println(string);
		
	}

}
