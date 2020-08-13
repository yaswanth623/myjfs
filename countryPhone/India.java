package countryPhone;

class India extends Country 
{
	@Override
	public boolean phoneNumberFormat(String number) {
		if(number.length()==14) {
			char[] arr=number.toCharArray();
			if(arr[0]=='+' && arr[1]=='9' && arr[2]=='1' && arr[3]=='-') {
//				System.out.println("+91- checked");
//				int ctr=0;
				for(int i=4; i<number.length();i++) 
					if(!(arr[i]>='0' && arr[i]<='9')) {
//						ctr++;
//						System.out.println("Alpha is checked");
//						System.out.println(ctr);
						return false;
					}
					return true;
			}
		}
		return false;
	}
}