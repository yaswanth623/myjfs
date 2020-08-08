
public class CheckStringsEqual {
	boolean isEqual(String str1, String str2) {
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		if(str1.length() == str2.length()) {
		for(int i=0; i<str1.length();i++) {
			if(!(Math.abs(ch1[i]-ch2[i])==32 || (ch1[i]-ch2[i])==0))
				return false;
		}
		return true;
	}
		return false;
	}
	public static void main(String[] args) {

		CheckStringsEqual x=new CheckStringsEqual();
		System.out.println(x.isEqual("hellO","HELLo"));
	}
}