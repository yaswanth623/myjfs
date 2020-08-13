package countryPhone;

public class MyMain {

	public static void main(String[] args) {
		India i=new India();
		System.out.println(i.phoneNumberFormat("+91-9876543210"));
		
		Brazil b=new Brazil();
		System.out.println(b.phoneNumberFormat("+55 15 98970-0033"));
		
		Norway n=new Norway();
		System.out.println(n.phoneNumberFormat("+47-49-99-99-99"));
		
		Qatar q=new Qatar();
		System.out.println(q.phoneNumberFormat("+974 3399-9999"));
		
		Turkey t=new Turkey();
		System.out.println(t.phoneNumberFormat("0509-999-999"));
		//another format for Turkey +90 509-999999
	}
}