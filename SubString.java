
public class SubString {
	String mySubStr(String data,int index){
		StringBuilder sb = new StringBuilder();
		sb.append(data);
		sb.deleteCharAt(index-1);
		String newString = sb.toString();
		System.out.println(newString);
		return newString;
	}
	String mySubStr(String data,int index,int noOfElem){
		StringBuilder sb = new StringBuilder();
		sb.append(data);
		sb.delete(index-1,((index-1)+noOfElem));
		String newString = sb.toString();
		System.out.println(newString);
		return newString;
	}
	public static void main(String[] args) {
		SubString s=new SubString();
		s.mySubStr("hello world",8,3);
	}
}