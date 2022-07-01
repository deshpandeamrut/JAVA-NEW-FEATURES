package com.palyground.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {

	public static void main(String[] args) {
		int number = 12345;
		
		System.out.println("Number Formatting--");
		NumberFormat nf =  NumberFormat.getCompactNumberInstance(new Locale("en", "IN"),NumberFormat.Style.LONG);
		NumberFormat nfShort =  NumberFormat.getCompactNumberInstance(new Locale("en", "IN"),NumberFormat.Style.SHORT);
		System.out.println(nf.format(number));
		System.out.println(nfShort.format(number));
	}

}
