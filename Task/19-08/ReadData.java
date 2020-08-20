package task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("data.txt");
			BufferedReader brd=new BufferedReader(fr);
			String line= brd.readLine();
			
			while(line != null) {
				line=line.replace(',',' ');
				System.out.println(line);
				line=brd.readLine();
			}
			brd.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
