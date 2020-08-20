package task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.Line;

public class AssociatingData {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("data.txt");
			BufferedReader brd=new BufferedReader(fr);
			String line= brd.readLine();
			line=brd.readLine();
			
			while(line != null) {
				ArrayList<Student> studList=new ArrayList<>();
				String[] arr = line.split(",");
				
				Student student=new Student(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],Integer.parseInt(arr[4]),Integer.parseInt(arr[5]));
				
				/*student.setRollno(Integer.parseInt(arr[0]));
				student.setClgid(Integer.parseInt(arr[1]));
				student.setName(arr[2]);
				student.setGender(arr[3]);
				student.setSem(Integer.parseInt(arr[4]));
				student.setMarks(Integer.parseInt(arr[5]));*/
				studList.add(student);
				line=brd.readLine();
				System.out.println(studList);
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
