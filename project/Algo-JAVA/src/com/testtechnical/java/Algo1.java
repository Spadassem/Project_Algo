package com.testtechnical.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Algo1 {

	public static int[] solution(int N, int[] A) { 

		int[] counters = new int[N];
		if ((N < 0 && N > 100000) || !IntStream.of(A).allMatch(a -> (a >= 1 && a <= N + 1))
				|| (A.length < 0 && A.length > 100000)) {
			System.out.println("invalid inputs");
		} else {
			calculate(counters, A, N);
		}
		return counters;
	}

	private static void calculate(int[] counters, int[] A, int N) {
		for (int i = 0; i < A.length; i++) {
			if (1 <= A[i] && A[i] < N) {
				counters[A[i] - 1]++;
			}
			if (A[i] == N + 1) {
				int max = Arrays.stream(counters).max().getAsInt();
				Arrays.fill(counters, max);
			}
		}

	}

	public static void main(String[] args) {
		int A[] = new int[7];
		A[0] = 3;
		A[1] = 4;
		A[2] = 4;
		A[3] = 6;
		A[4] = 1;
		A[5] = 4;
		A[6] = 4;

		System.out.println(display(solution(5, A)));
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
