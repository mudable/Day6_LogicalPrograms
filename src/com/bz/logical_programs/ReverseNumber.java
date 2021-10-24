package com.bz.logical_programs;

public class ReverseNumber {
	public void display() {
		int rem, rev = 0, num = 1234;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println(rev);

	}

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.display();

	}

}
