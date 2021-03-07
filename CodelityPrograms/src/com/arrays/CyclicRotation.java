package com.arrays;

public class CyclicRotation {

	public static void main(String[] args) {

		CyclicRotation obj = new CyclicRotation();
		int[] A = { 2, 4, 5, 6, 7 };
		int k = 3;
		int[] cycle = obj.solution(A, k);
		for (int i = 0; i < cycle.length; i++)
			System.out.print(cycle[i]);
	}

	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		int size = A.length;
		int[] cycle = new int[size];
		for (int x = 0; x < size; x++) {
			cycle[(x + K) % size] = A[x];
		}
		return cycle;
	}
}
