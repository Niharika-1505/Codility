package com.prefixsums;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 0, 1, 0, 1, 1 }));
	}

	public static int solution(int[] A) {
		int countOfZeros = 0, count = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				countOfZeros++;
			if (A[i] == 1)
				count += countOfZeros;
			if (count > 1000000000)
				return -1;
		}
		return count;
	}
}
