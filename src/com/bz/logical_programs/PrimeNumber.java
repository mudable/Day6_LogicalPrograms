package com.bz.logical_programs;

import java.util.Scanner;

public class PrimeNumber {
	public void display() {
		System.out.println("Enter no to check for prime");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int store = 0;
		for (int i = 2; i < no - 1; i++) {
			if (no % i == 0) {
				store = store + 1;
			}
		}
		if (store > 0) {
			System.out.println(" not a  prime number");
		} else {
			System.out.println(" is a prime number");
		}
	}

	public static void main(String args[]) {
		PrimeNumber obj = new PrimeNumber();
		obj.display();
	}
}
