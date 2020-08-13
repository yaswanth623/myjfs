package countryPhone;

class Brazil extends Country 
{
	@Override
	public boolean phoneNumberFormat(String number) {
		if(number.length()==17) {
			char[] arr=number.toCharArray();
			if(arr[0]=='+' && arr[1]=='5' && arr[2]=='5' && arr[3]==' ' && arr[4]=='1' && arr[5]=='5' && arr[6]==' ' && arr[12]=='-') {
				for(int i=7; i<12;i++) 
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				for (int i=13;i<17;i++)
					if(!(arr[i]>='0' && arr[i]<='9')) {
						return false;
					}
				return true;
			}
		}
		return false;
	}
}