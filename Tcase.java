
public class Tcase {

	public static void main(String[] args) {
		char i = args[0].charAt(0);
		if (i >= 97 && i <= 123)
			System.out.println("Lower Case");
		else if (i >= 65 && i <= 96)
			System.out.println("Upper Case");
		else
			System.out.println("Error");

	}

}
