import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		File file=new File("abc.txt");
		FileWriter out;
		try {
			out = new FileWriter(file,true);
			out.write("This is new txt");
			
			System.out.println("Done");
			out.close();
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
