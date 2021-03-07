package com.countingelements;

import java.util.HashSet;

public class FrogRiverOne {

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 5, 3, 2, 5 }));
		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 5, 3, 5, 2 }));
		System.out.println(solution(2, new int[] { 1, 1, 1, 2 }));
		System.out.println(solution(10, new int[] { 10, 2, 5, 6, 7, 1, 3, 4, 7, 9, 8, 10, 9, 10, 10 }));
	}

	public static int solution(int X, int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> fallen = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X)
				fallen.add(A[i]);

			if (fallen.size() == X)
				return i;
		}

		return -1;
	}

}
