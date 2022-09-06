package com.javaex.bj03;

import java.util.Scanner;

//1~n까지의 합 구하기

public class Q03 {	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int n = sc.nextInt();
				
		for(int i = 1; i<=n; i++) {
			
			sum = sum + i;
			System.out.println(sum);
			
		}
		
		sc.close();
	}

}
