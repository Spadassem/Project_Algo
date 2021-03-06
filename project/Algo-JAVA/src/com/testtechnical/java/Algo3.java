package com.testtechnical.java;

import java.util.Scanner;

public class Algo3{

	public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		System.out.println("N = ");
		int N = Integer.parseInt(sc.nextLine());
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("A[" + i + "] = ");
			A[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		int N = A.length;

		if (N == 0) {
			return 0;
		}

		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {

			int value = Math.abs(A[i]);
			sum += value;

			if (max < value) {
				max = value;
			}

			A[i] = value;
		}

		int[] counts = new int[max + 1];

		for (int value : A) {
			counts[value]++;
		}

		int[] Total = new int[sum + 1];

		for (int i = 1; i < Total.length; i++) {
			Total[i] = -1;
		}

		for (int i = 1; i < counts.length; i++) {

			for (int j = 0; j < Total.length; j++) {

				if (Total[j] >= 0) {
					Total[j] = counts[i];
				} else if (j - i >= 0 && Total[j - i] > 0) {
					Total[j] = Total[j - i] - 1;
				}
			}
		}

		int result = sum;

		for (int i = 0; i < Total.length / 2 + 1; i++) {

			if (Total[i] >= 0 && result > Math.abs(sum - 2 * i)) {
				result = Math.abs(sum - 2 * i);
			}
		}

		return result;
	}
}

//    private static int[] init() {
//    	int N = 0;
//		Scanner sc = new Scanner(System.in);
//		 N = Integer.parseInt(sc.nextLine());
//		int A[] = new int[N];
//		for (int i = 0; i < N; i++) {
//			System.out.println("A[" + i + "] = ");
//			A[i] = Integer.parseInt(sc.nextLine());
//		}
//		return A;
//    	
//    }