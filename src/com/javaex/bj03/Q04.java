package com.javaex.bj03;

import java.util.Scanner;

public class Q04 {		//영수증
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();		//총금액
		int N = sc.nextInt();		//개수
		int sum = 0;  
		
		for(int i=1; i<=N; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum += a*b; 	//sum = sum + a*b;
		}
		
		if(sum == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
