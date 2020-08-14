
public class CustomException extends Exception{
	public CustomException() {
		super("Tickets Out of Stock");
		}
}

class BookMyShow{
	static int AvailableTickets=10;
	void bookTicket(int NoOfTickets) throws CustomException{
		if(NoOfTickets > AvailableTickets)
			throw new CustomException();
		else
			AvailableTickets=AvailableTickets-NoOfTickets;
		System.out.println(NoOfTickets +" ticket(s) booked enjoy the show. Available ticket(s) "+AvailableTickets);
	}
}