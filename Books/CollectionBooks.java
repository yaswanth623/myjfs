import java.util.HashSet;
import java.util.Iterator;

public class CollectionBooks {
	public static void main(String[] args) {
		HashSet<Books> hs=new HashSet<>();
		
		Books b1=new Books(978012301, "India 2020", "Abdul Kalam");
		Books b2=new Books(978012302, "The Alchemist", "Paulo Coelho");
		Books b3=new Books(978012303, "Sapiens", "Yuval Noah Harari");
		Books b4=new Books(978012304, "1984", "George Orwell");
		Books b5=new Books(978012305, "Outliers", "Malcolm Gladwell");
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		
		Iterator<Books> itr=hs.iterator();
		
		while(itr.hasNext()) {
			itr.next().dispBooks();
		}
		
	}
}
