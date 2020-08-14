import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {

		Books b1=new Books(978012301, "India 2020", "Abdul Kalam");
		Books b2=new Books(978012302, "The Alchemist", "Paulo Coelho");
		Books b3=new Books(978012303, "Sapiens", "Yuval Noah Harari");
		Books b4=new Books(978012304, "1984", "George Orwell");
		Books b5=new Books(978012305, "Outliers", "Malcolm Gladwell");


		HashMap<Long, Books> hm=new HashMap();

		hm.put(b1.getISBN(), b1);
		hm.put(b2.getISBN(), b2);
		hm.put(b3.getISBN(), b3);
		hm.put(b4.getISBN(), b4);
		hm.put(b5.getISBN(), b5);
		
		Set<Long>keys=hm.keySet();
		Iterator<Long> itr=keys.iterator();
		
		if(args[0].equals("all")) {
			while(itr.hasNext()){
			long key=itr.next();
			System.out.println(hm.get(key));
			}
		}
		else {
			long isbn=Long.parseLong(args[0]);
		Books bk= hm.get(isbn);
		System.out.println(bk);
		}
	}
}