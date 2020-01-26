package com.testtechnical.java;

import java.util.Arrays;
import java.util.Scanner;

public class Algo1 {

	public static int[] solution(int N, int[] A) {

		int[] counters = new int[N];
		calculate(counters, A, N);
		return counters;
	}

	private static void calculate(int[] counters, int[] A, int N) {
		
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (1 <= A[i] && A[i] < N) {
				counters[A[i] - 1]++;
				if (max < counters[A[i] - 1]) {
					max = counters[A[i] - 1];
				}
			}
			if (A[i] == N + 1) {
				Arrays.fill(counters, max);
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("N = ");
		int N = Integer.parseInt(sc.nextLine());
		System.out.println("M = ");
		int M = Integer.parseInt(sc.nextLine());
		int A[] = new int[M];
		for (int i = 0; i < M; i++) {
			System.out.println("A[" + i + "] = ");
			A[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println(display(solution(N, A)));

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
