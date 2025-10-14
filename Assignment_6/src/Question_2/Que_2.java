package Question_2;
import java.util.InputMismatchException;


public class Que_2 {
    public static void main(String[] args) {
		
    	try {
			Circle c = new Circle();
			c.accpetRecord();
			
			c.accessor();
		} catch (DiameterNotNegative e) {
			System.out.println(e.getMessage());
		}
    	catch (InputMismatchException e) {
    		System.out.println("invalid input");
    	}
	}
}
