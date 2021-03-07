package com.timecomplexity;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogJmp obj = new FrogJmp();
		int solution = obj.solution(10, 85, 30);
		System.out.println("Number of Steps: " + solution);
	}

	public int solution(int X, int Y, int D) {
		int steps = (Y - X) / D;
		int extras = (Y - X) % D > 0 ? 1 : 0;
		return steps + extras;
	}
}
