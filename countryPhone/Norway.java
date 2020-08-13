package countryPhone;

class Norway extends Country 
{
	@Override
	public boolean phoneNumberFormat(String number) {
		if(number.length()==15) {
			char[] arr=number.toCharArray();
			if(arr[0]=='+' && arr[1]=='4' && arr[2]=='7' && arr[3]=='-' && arr[4]=='4' && arr[6]=='-' && arr[9]=='-' && arr[12]=='-') {
				for(int i=5;i<6;i++) 
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=7;i<9;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=10;i<12;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=13;i<15;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				return true;
			}
		}
		return false;
	}
}