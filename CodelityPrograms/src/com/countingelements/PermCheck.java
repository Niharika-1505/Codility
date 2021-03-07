package com.countingelements;

public class PermCheck {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 4, 1, 3, 2 }));
		System.out.println(solution(new int[] { 4, 1, 3 }));
		System.out.println(solution(new int[] { 2, 1, 3 }));
		System.out.println(solution(new int[] { 1, 1, 3 }));
		System.out.println(solution(new int[] { 3, 2, 1 }));
		System.out.println(solution(new int[] { 1 }));
		System.out.println(solution(new int[] { 1 }));
		System.out.println(solution(new int[] { 1000000000 }));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		boolean[] seen = new boolean[A.length + 1];

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 1 || A[i] > A.length)
				return 0;
			if (seen[A[i]] == true)
				return 0;
			else
				seen[A[i]] = true;
		}

		return 1;
	}

}
