
public class Equals {
	boolean isEqual(char c1, char c2) {

			if(!((c1-c2 ==32) || (c1-c2 ==0) || (c2-c1 == 32))) {
				return false;
		}
		return true;
	}
	public static void main(String[] args) {

		Equals x=new Equals();
		System.out.println(x.isEqual('O','o'));
	}
}