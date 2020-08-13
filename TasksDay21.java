
public class TasksDay21 {
	
	String reverseString(String str){
		String str1="";
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {
			str1=str1+arr[i];
			}
		String myStr=new String(str1);
		return myStr;
	}
	
	String lowerCase(String str) {
		String str1="";
		char[] arr=str.toCharArray();
		for(int i = 0;i<str.length();i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				str1=str1 + (char)(arr[i] + 32);
			else
				str1=str1 + arr[i];
		}
		String myStr=new String(str1);
		return myStr;
	}
	
	String upperCase(String str) {
		String str1="";
		char[] arr=str.toCharArray();
		for(int i = 0;i<str.length();i++) {
			if(arr[i]>='a' && arr[i]<='z')
				str1=str1 + (char)(arr[i] - 32);
			else
				str1=str1 + arr[i];
		}
		String myStr=new String(str1);
		return myStr;
	}
	
	String toggleCase(String str) {
		String str1="";
		char[] arr=str.toCharArray();
		for(int i = 0;i<str.length();i++) {
			if(arr[i]>='a' && arr[i]<='z')
				str1=str1 + (char)(arr[i] - 32);
			else if(arr[i]>='A' && arr[i]<='Z')
				str1=str1 + (char)(arr[i] + 32);
			else
				str1=str1 + arr[i];
		}
		String myStr=new String(str1);
		return myStr;
	}
	
	String maintainCaps(String str) {
		String str1="";
		String str2="";
		String str3="";
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {
			str1=str1+arr[i];
			}
		
		char[] arr2=str1.toCharArray();
		for(int i = 0;i<str1.length();i++) {
			if(arr2[i]>='A' && arr2[i]<='Z')
				str2=str2 + (char)(arr2[i] + 32);
			else
				str2=str2 + arr2[i];
		}
		
		char[] arr3=str2.toCharArray();
		for(int i = 0;i<str1.length();i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				str3=str3 + (char)(arr3[i]-32);
			else
					str3=str3 + arr3[i];
		}
		
		String myStr=new String(str3);
		return myStr;
	}

	public static void main(String[] args) {
		TasksDay21 t= new TasksDay21();
		System.out.println(t.reverseString("hello"));
		System.out.println(t.lowerCase("convert to SMALL"));
		System.out.println(t.upperCase("convert to caps"));
		System.out.println(t.toggleCase("This Function Toggles"));
		System.out.println(t.maintainCaps("CAPS POSITIONS are preserved"));
	}
}
