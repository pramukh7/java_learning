package fileReaderAndWritter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\dev\\Sanjay\\extraworkspace\\RestAssuredAutomation\\src\\test\\resources\\FileToRead.txt");
		BufferedReader bf = new BufferedReader(fileReader);
		String line="";
		while((line = bf.readLine()) != null)
		{
			System.out.println(line);
		}
		fileReader.close();
		bf.close();
	}
}
