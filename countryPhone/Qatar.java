package countryPhone;

class Qatar extends Country 
{
	@Override
	public boolean phoneNumberFormat(String number) {
		if(number.length()==14) {
			char[] arr=number.toCharArray();
			if(arr[0]=='+' && arr[1]=='9' && arr[2]=='7' && arr[3]=='4' && arr[4]==' ' && arr[5]=='3' && arr[6]=='3' && arr[9]=='-') {
				for(int i=7; i<9;i++) 
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=10;i<14;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				return true;
			}
		}
		return false;
	}
}