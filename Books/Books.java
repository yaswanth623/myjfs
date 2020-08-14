
public class Books {
	long ISBN;
	String Title;
	String Author;

	
	public Books(long iSBN, String title, String author) {
		super();
		ISBN = iSBN;
		Title = title;
		Author = author;
	}


	public long getISBN() {
		return ISBN;
	}


	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + "]";
	}


	public void dispBooks(){
		System.out.println(Title+" "+Author+" "+ISBN);
	}

}
