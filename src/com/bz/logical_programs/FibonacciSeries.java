package com.bz.logical_programs;

public class FibonacciSeries {
	public void fibonacciSeries(int x) {
		int firstNum = 1, secondNum = 1, result = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);

		for (int i = 3; i <= x; i++) {
			result = firstNum + secondNum;
			System.out.println(result);
			firstNum = secondNum;
			secondNum = result;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		obj.fibonacciSeries(5);
	}

}
