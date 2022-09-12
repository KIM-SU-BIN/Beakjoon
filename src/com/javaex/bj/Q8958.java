package com.javaex.bj;

import java.util.Scanner;

public class Q8958 { // 보승이 추천문제
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 개수
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			String ox = sc.next();
			// char c ='v'; //c == 'v'
			// String s = "v"; // s.equals("v")

			int sum = 0;
			int score = 0;

			for (int j = 0; j < ox.length(); j++) {
				if (ox.charAt(j) == 'O') {
					// 스코어 + 1
					score++; // sum += 1;
				} else {
					// 스코어를 0으로 초기화
					score = 0;
				}
				// sum에서 스코어를 더하다
				sum += score;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
