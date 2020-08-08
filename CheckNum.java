
public class CheckNum {
	boolean isNum(String inp) {
		char[] arr=inp.toCharArray();
		for(int i=0; i<inp.length();i++) {
			if(arr[i]>='0' && arr[i]<='9')
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		CheckNum inp=new CheckNum();
		System.out.println(inp.isNum("juice4"));
	}
}