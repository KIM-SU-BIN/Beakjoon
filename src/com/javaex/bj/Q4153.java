package com.javaex.bj;

import java.util.Scanner;

public class Q4153 {	//보승이 추천문제 -> 직각삼각형 문제
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//a,b,c 값중 가장 큰 값 구하기
			
			if(b>a) {	//a와 b자리 바꾸기
				int temp = b;
				b = a;
				a = temp;
			}
			
			if(c>a) {	//a와 c자리 바꾸기
				int temp = c;
				c = a;
				a = temp;
			}
			
			//a,b,c가 0인 경우 반복문 멈춤
			if(a==0 && b==0 && c==0) {
				break;
			}
			
			if(a*a == b*b + c*c) {			//if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a)
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}	
		} 	
		sc.close();
	}
}
