import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("student.ser");
			ObjectInputStream oin=new ObjectInputStream(fin);
			Student stud=(Student)oin.readObject();
			System.out.println(stud);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
