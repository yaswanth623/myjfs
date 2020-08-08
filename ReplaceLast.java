
public class ReplaceLast {

	String RepL(String str,char oldChar , char newChar)
	{
		char[] arr=str.toCharArray();
		for(int i=str.length()-1;i<str.length();i--){
		if(arr[i]==oldChar) {
		arr[i]=newChar;
		break;
		}
		//else
			//System.out.println("No Character found");
		}
		String manStr=new String(arr);
		return manStr;
		}
	
	public static void main(String[] args) {
		
		ReplaceLast scm=new ReplaceLast();
		String data=scm.RepL("hello world", 'l', 'k');

		System.out.println(data);

	}

}
