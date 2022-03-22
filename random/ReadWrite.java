package random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWrite{
	public ArrayList<String> read(String filename){
		ArrayList<String> fileData = new ArrayList<String>();
		try {

			File file = new File(filename);
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				fileData.add(reader.nextLine());
			}
			reader.close();
		} catch (IOException e) {
			System.err.println("An unhandled exception has occured.");
			System.err.println();
			e.printStackTrace(System.err);
		}
		return fileData;
	}
	public void write(String filename,ArrayList<String> data){
		File file = new File(filename);
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(filename);
			for (String i:data) {
				writer.write(i);
			}
			writer.close();
		} catch (IOException e){
			System.err.println("An unhandled exception has occured.");
			System.err.println();
			e.printStackTrace(System.err);
		}
	}
	public static void main(String[] args){
		String[] tmp = {"Line 1\n","Line 2\n"};
		ArrayList<String> db = new ArrayList<String>(Arrays.asList(tmp));
		ReadWrite readwrite = new ReadWrite();
		readwrite.write("tmp.txt",db);
	}
}

