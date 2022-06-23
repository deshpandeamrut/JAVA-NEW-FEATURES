package com.palyground.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteAsString {
	public static void main(String[] args) throws IOException {
		
		Path readPath = Paths.get("./resources/test_read.txt");
		String fileData = Files.readString(readPath);
		System.out.println(fileData);
		
		Path writePath = Paths.get("./resources/test_write.txt");
		Files.writeString(writePath, fileData);
	}
}
