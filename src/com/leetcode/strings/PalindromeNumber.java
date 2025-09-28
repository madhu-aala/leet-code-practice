package com.leetcode.strings;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
	}

	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
