package com.greatlearning.lab3.q1.main;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBracketsQ1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter a String ");
		String userInput = in.nextLine();
		boolean answer = checkBrackets(userInput);
		if (answer) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

	public static boolean checkBrackets(String checkBrackets) {
		if ((checkBrackets.length() % 2) == 1)
			return false;
		else {
			Stack<Character> s = new Stack<>();
			for (char bracket : checkBrackets.toCharArray())
				switch (bracket) {
				case '{':
					s.push('}');
					break;
				case '(':
					s.push(')');
					break;
				case '[':
					s.push(']');
					break;
				default:
					if (s.isEmpty() || bracket != s.peek()) {
						return false;
					}
					s.pop();
				}
			return s.isEmpty();
		}
	}
}
