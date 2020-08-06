
public class TrailZero {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int counter = 0;
		while (x % 10 == 0) {
		    counter++;
		    x /= 10;
		}
System.out.println(counter++);
	}
}
