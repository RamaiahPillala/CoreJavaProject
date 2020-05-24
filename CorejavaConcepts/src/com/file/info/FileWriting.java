package com.file.info;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting {
	
	public static void main(String arg[]) throws Exception {
		String fileName = "C:\\Users\\ramai\\Desktop\\input\\Int19b.txt";
		File file = new File(fileName);
		BufferedWriter data = null;
		try {
			Scanner sc = new Scanner(file);
			File file2 = new File("C:\\Users\\ramai\\Desktop\\output\\Int19b.txt");
			data = new BufferedWriter(new FileWriter(file2));
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				data.write(sc.nextLine());
				data.newLine();
				//data.close();
							}
			//data.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
