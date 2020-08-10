
public class RepeatedChar {
	String repChar(String data) {
		char[] arr = data.toCharArray();
		 for(int i = 0; i <arr.length; i++) {  
	            int count = 1;  
	            for(int j = i+1; j <arr.length; j++) {  
	                if(arr[i] == arr[j] && arr[i] != ' ') {  
	                    count++;    
	                    arr[j] = '0';  
	                }  
	            }    
	            if(count > 1 && arr[i] != '0')  
	                System.out.println(count+" "+arr[i]); 
		 }
	return data;
	}
	public static void main(String[] args) {
		RepeatedChar r=new RepeatedChar();
		r.repChar("hello world");
	}
}