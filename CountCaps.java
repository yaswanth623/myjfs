
public class CountCaps {
	int countCaps(String inp) {
		int ctr=0;
		char[] arr=inp.toCharArray();
		for(int i=0; i<inp.length();i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				ctr++;
		}
		return ctr++;
	}
	public static void main(String[] args) {
		CountCaps inp=new CountCaps();
		System.out.println(inp.countCaps("JUICe"));
	}
}