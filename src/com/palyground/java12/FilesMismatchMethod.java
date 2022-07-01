package com.palyground.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesMismatchMethod {
	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("./resources/test_read.txt");
		Path path2 = Paths.get("./resources/test_write.txt");
		 
		long res = Files.mismatch(path1,path2);
		/**
		 * res will be first mismatch position or -1L if no mismatch
		 */
		System.out.println("Mismatch position: "+res);
	}
}
