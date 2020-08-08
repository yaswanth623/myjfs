
public class CheckCapsOnly {
	boolean isCapsOnly(String inp) {
		char[] arr=inp.toCharArray();
		for(int i=0; i<inp.length();i++) {
			if(!(arr[i]>='A' && arr[i]<='Z'))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		CheckCapsOnly inp=new CheckCapsOnly();
		System.out.println(inp.isCapsOnly("JUICE"));
	}
}