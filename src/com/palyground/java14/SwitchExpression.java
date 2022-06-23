package com.palyground.java14;

/*
 * swicth returns a value and is called expression
 * doesn't need a break
 */
public class SwitchExpression {

	public static String getRank(int n) {
		String rank = "";

		switch (n) {
		case 1:
			rank = "First Rank";
			break;
		case 2:
			rank = "Second Rank";
			break;
		default:
			rank = "NA";
		}
		return rank;
	}

	public static String getRankWithSwitchExpression(int n) {
		String rank = switch (n) {// swicth returns a value
		case 1 -> "First Rank";
		case 2 -> "Second Rank";
		default -> "NA";
		}; // need semicolon
		return rank;
	}
}
