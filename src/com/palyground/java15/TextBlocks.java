package com.palyground.java15;

/**
 * Usage - Start a string with """ the terminate with """
 * @author XKS9
 *
 */
public class TextBlocks {

	public static void main(String[] args) {

		String str = "Line1\nLine2\nLine3";

		String strTextBlock = """
				Line 1
					Line 2 
				Line 3
				""";

		/*
		 * Instead of putting \n we can use textblocks which makes it easier to read and
		 * maintain. """ then enter then type text per line then close with """
		 * Maintains the formatting of the line as well
		 * Trailing white spaces are skipped
		 */

		System.out.print(str);
		System.out.println("Text Block");
		System.out.print(strTextBlock);
	}
}
