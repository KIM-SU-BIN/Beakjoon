package com.javaex.bj03;

import java.util.Scanner;

public class Q01 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<9; i++) {
			System.out.println(N + " * " + (i+1) + " = " + N*(i+1) );
			
		}
		
		sc.close();
	}
}
