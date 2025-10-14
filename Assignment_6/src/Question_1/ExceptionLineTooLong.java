package Question_1;

public class ExceptionLineTooLong extends Exception {
    private String invalidLenght;

	public ExceptionLineTooLong(String invalidLenght) {
		this.invalidLenght = invalidLenght;
	}

	public String getInvalidLenght() {
		return invalidLenght;
	}

	public void setInvalidLenght(String invalidLenght) {
		this.invalidLenght = invalidLenght;
	}
	
    @Override
    public String getMessage() {
    	return invalidLenght;
    }
    
    
   
}
