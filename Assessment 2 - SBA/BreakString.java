package sba;

public class BreakString {
	
	void brkStr(String data){
		String[] arr = data.split(" ");
		for (String a: arr)
			System.out.println(a);
	}
	
	void brkStrRev(String data){
		String[] arr = data.split(" ");
		for (String a: arr) {
			char[] arr2=a.toCharArray();
			String str1="";
			for (int i = arr2.length-1; i>=0; i--) {
				str1=str1+arr2[i];
			}
			System.out.println(str1);
		}	
	}
	
	public static void main(String[] args) {
		BreakString bs= new BreakString();
		bs.brkStr("This Is Java Programming");
		bs.brkStrRev("This Is Reversed Java Programming");
	}
}