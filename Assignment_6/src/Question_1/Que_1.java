package Question_1;
import java.util.Scanner;

public class Que_1 {

	public static String takeStringInput(String str) throws ExceptionLineTooLong{
		
		if (str.length() > 80) throw new ExceptionLineTooLong("Enterd message is to Long");
		return str;
	}
	
   public static void main(String[] args) {
	   
	   try {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Enter message : ");
		   String str = sc.nextLine();

		   System.out.println("message : " + takeStringInput(str));
		   
	} catch (Exception e) {
        System.out.println(e.getMessage());
	}
	   
}
}
