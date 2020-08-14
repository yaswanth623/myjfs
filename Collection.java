import java.util.Vector;

public class Collection {
	public static void main(String[] args) {
		Vector<Integer> marks=new Vector<Integer>();
		marks.add(50);
		marks.add(60);
		marks.add(70);
		int x=90;
		marks.add(x);
		System.out.println(marks);
	}
}
