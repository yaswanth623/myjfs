package sba;

public class CustomException extends Exception{
		public CustomException() {
			super("Entered mark is not within valid range(1 - 100)");
			}
}

class MarksCheck{
	void markCheck(int mark) throws CustomException{
		if(mark < 1 || mark>100)
			throw new CustomException();
		else
		System.out.println("Entered mark(s):"+mark);
	}


}