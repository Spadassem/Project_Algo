package com.testtechnical.java;

import java.util.Scanner;

public class Algo2 {

	public static int[] solution(int A[], int B[]) {

		int C[] = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			C[i] = countWays(A[i]) % (B[i] * 2);
		}

		return C;
	}

	private static int fib(int n) {
		int table[] = new int[n];
		table[0] = 1;
		table[1] = 1;

		for (int i = 2; i < n; i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		return table[n - 1];
	}

	private static int countWays(int s) {
		return fib(s + 1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N = ");
		int N = Integer.parseInt(sc.nextLine());

		int A[] = new int[N];
		int B[] = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("A[" + i + "] = ");
			A[i] = Integer.parseInt(sc.nextLine());
			System.out.println("B[" + i + "] = ");
			B[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println(display(solution(A, B)));// resultat prévue : [5,1,0,2,1]

	}

	private static String display(int C[]) {
		String st = "[";
		for (int i = 0; i < C.length - 1; i++) {
			st = st + C[i] + ",";
		}
		st = st + C[C.length - 1] + "]";
		return st;
	}

}
