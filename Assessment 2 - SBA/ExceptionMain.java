package sba;

public class ExceptionMain {
	public static void main(String[] args) {
		MarksCheck m=new MarksCheck();
		try {
			m.markCheck(100);
		}
		catch (Exception e) {
			System.out.println(e);
			}
	}
}
