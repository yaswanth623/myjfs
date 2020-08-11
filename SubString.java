
public class SubString {
	String mySubStr(String data,int index){
		int i;
		String a="";
		char[] arr = data.toCharArray();
		for (i=index; i<data.length(); i++) {
			a =a+arr[i];
		}
		String newStr = new String(a);
		return newStr;
	}

	String mySubStr(String data, int index,int subele)
	{
		int i;
		String b="";
		char[] arr = data.toCharArray();
		for(i=0;i<data.length();i++) {
			if(i>=index && i<=(index+subele-1)) {
				continue;
			}
			else
				b=b+arr[i];
		}
		String newStr = new String(b);
		return newStr;
 	}
	
	public static void main(String[] args) {
		SubString s=new SubString();
		String str =s.mySubStr("Hello", 1);
		System.out.println(str);
	}
}