
public class ReplaceFirst {

	String RepF(String str,char oldChar , char newChar)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++){
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
		
		ReplaceFirst scm=new ReplaceFirst();
		String data=scm.RepF("hello world", 'l', 'k');

		System.out.println(data);

	}

}
