import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderDemo {
	public static void main(String[] args) {
		InputStreamReader i=new InputStreamReader(System.in);
		try {
		BufferedReader br= new BufferedReader(i);
		String data= br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
