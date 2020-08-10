
public class CalculationDemo {

	int sum(int... x){
		int s = 0;  
		  for (int i : x)  
		    s += i;
		  System.out.println("Sum is "+s);//sum
		  
		    int max = Integer.MIN_VALUE;
		    for (int currentNumber : x) {
		      if (currentNumber > max) {
		        max = currentNumber;
		      }
		    }
		      System.out.println("Maximum value is "+max);
		      
			    int min = Integer.MAX_VALUE;
			    for (int currentNumber : x) {
			      if (currentNumber < min) {
			        min = currentNumber;
			      }
			    }
			      System.out.println("Minimum value is "+min);
			   
			      int ctro=0;
			      for(int i=0;i<x.length;i++){  
			    	  if(x[i]%2!=0) {
			    		  ctro++;
			    	  }
			      }
			    	  System.out.println("No. of odd values: "+ctro);
			    	  
			    	  int ctre=0;
				      for(int i=0;i<x.length;i++){  
				    	  if(x[i]%2==0) {
				    		  ctre++;
				    	  }
				      }
				    	  System.out.println("No. of even values: "+ctre);
			
				    	  int ctr3=0;
					      for(int i=0;i<x.length;i++){  
					    	  if(x[i]%3==0) {
					    		  ctr3++;
					    	  }
					      }
					    	  System.out.println("No. of values divisible by three: "+ctr3);
		  return s;
	}

		public static void main(String[] args) {
		CalculationDemo c=new CalculationDemo();
		c.sum(10,1,4,9,5);
	}
}