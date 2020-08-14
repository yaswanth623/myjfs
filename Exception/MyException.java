
public class MyException {
	public static void main(String[] args) {
		BookMyShow b=new BookMyShow();
		try {
			b.bookTicket(6);

			b.bookTicket(2);

			b.bookTicket(1);

			BookMyShow b1=new  BookMyShow();
			b1.bookTicket(2);
			}
		
		catch (Exception e) {
			System.out.println(e);
			}
		}
}
