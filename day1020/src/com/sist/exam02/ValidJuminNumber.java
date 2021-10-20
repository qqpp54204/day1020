package com.sist.exam02;

import java.util.Scanner;

public class ValidJuminNumber {

	public static void main(String[] args) {
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오(하이픈을 입력하세요)==>");
		jumin = sc.next();
		
		int []n = {2,3,4,5,6,7,0,8,9,2,3,5};
		
		int sum = 0;
		
		for(int i=0 ; i < jumin.length() -1 ; i++) {
			if(i !=6) {
		sum = sum + Integer.parseInt(jumin.charAt(i)+"") * n[i];
			}
		}
		
		sum = sum % 11;
		sum = 11 - sum;
		if(sum == 10) {
			sum = 0;
		}
		if(sum == 11) {
			sum = 1;
		}
		
		int check = Integer.parseInt(jumin.charAt(13)+"");
		
		if(sum == check) {
			System.out.println("올바른 주민번호 입니다.");
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
		

	}

}
