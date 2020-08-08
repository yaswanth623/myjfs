
public class CheckUpper {
	String hasUpper(String inp) {
		char[] arr=inp.toCharArray();
		for(int i=0; i<inp.length();i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				return "Yes";
		}
		return "No";
	}
	public static void main(String[] args) {
		CheckUpper inp=new CheckUpper();
		System.out.println(inp.hasUpper("juIce4"));
	}
}