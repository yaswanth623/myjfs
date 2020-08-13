package countryPhone;

class Turkey extends Country 
{
	@Override
	public boolean phoneNumberFormat(String number) {
		if(number.length()==14) {
			char[] arr=number.toCharArray();
			if(arr[0]=='+' && arr[1]=='9' && arr[2]=='0' && arr[3]==' ' && arr[4]=='5' && arr[5]=='0' && arr[7]=='-') {
				for(int i=6; i<7;i++) 
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=8;i<14;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				return true;
			}
		}
		else if(number.length()==12) {
			char[] arr=number.toCharArray();
			if(arr[0]=='0' && arr[1]=='5' && arr[2]=='0' && arr[4]=='-' && arr[8]=='-') {
				for(int i=3; i<4;i++) 
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=5;i<8;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=9;i<12;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				return true;
			}
		}
		return false;
	}
}