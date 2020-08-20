import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialilzableDemo {

	public static void main(String[] args) {
		try {
		Student student=new Student(1, "Thor", "Asgard");
		FileOutputStream fout = new FileOutputStream("student.ser");
		ObjectOutputStream ostr=new ObjectOutputStream(fout);
		ostr.writeObject(student);
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
