package com.leetcode.strings;

/*Question: 557

Example:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"*/

public class ReverseWords {

	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (String word : words) {
			sb.append(new StringBuilder(word).reverse()).append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
}
