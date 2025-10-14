package Question_2;

public class DiameterNotNegative extends Exception {
    private String message = "";

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		String str = "Diameter should not negative";
		
		return str;
	}
    
    
}
