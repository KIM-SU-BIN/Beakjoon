package com.javaex.bj03;

import java.util.Scanner;

public class Q02{
	public static void main(String[] args) {
		
		//입력받을 때
		//Scanner.sc = new scanner();
		//sc.next(); 문자열
		//sc.nextInt(); 숫자
		//sc.nextDouble(); 실수	
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(	A + B );
		}
		
		sc.close();
	}
}