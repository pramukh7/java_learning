package fileReaderAndWritter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterDemo {

	public static void main(String[] args) throws IOException {
		String myString = "Mahant Swami Maharaj";
		String path = "C:\\dev\\Sanjay\\extraworkspace\\RestAssuredAutomation\\src\\test\\resources\\writterDemo.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		bw.write(myString);
		bw.close();

	}

}
