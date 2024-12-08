package com.interviewprep.leetcode.easy.fibonaccinumber;

public class FirstApproach {

	public static void main(String[] args) {
		
		FirstApproach fa = new FirstApproach();
		int fib = fa.fib(10);
		
		System.out.println(fib);
	}
	
	public int fib(int n) {

		int fib = 0;
		
		// declare the initial variables as 0, 1
		int prev = 0;
		int cur = 1;

		for(int i=0; i<n; i++) {
			
			// fib is addition of previous two numbers
			fib = prev + cur;
			
			// update previous two numbers
			prev = cur;
			cur = fib;

		}

		return prev;

	}

}
