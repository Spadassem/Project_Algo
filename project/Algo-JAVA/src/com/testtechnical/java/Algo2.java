package com.testtechnical.java;

import java.util.stream.IntStream;

public class Algo2 {

	public static int[] solution(int A[], int B[]) { // on peut declarer B de type short pour l'optimisation

		int C[] = new int[A.length];
		if (A.length != B.length || !IntStream.of(A).allMatch(a -> (a >= 0 && a <= 50000))
				|| !IntStream.of(B).allMatch(b -> (b >= 0 && b <= 30))) {
			System.out.println("invalid inputs");
		} else {
			for (int i = 0; i < A.length; i++) {
				C[i] = countWays(A[i]) % (B[i] * 2);
			}
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

		int A[] = new int[5];
		int B[] = new int[5];
		A[0] = 4;
		B[0] = 3;
		A[1] = 4;
		B[1] = 2;
		A[2] = 5;
		B[2] = 4;
		A[3] = 5;
		B[3] = 3;
		A[4] = 1;
		B[4] = 1;

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
