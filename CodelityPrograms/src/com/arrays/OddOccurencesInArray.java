package com.arrays;

public class OddOccurencesInArray {

	public static void main(String[] args) {
		OddOccurencesInArray obj = new OddOccurencesInArray();
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		int solution = obj.solution(A);
		System.out.println("Solution: " + solution);
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int elem = 0;

		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
	}
}
