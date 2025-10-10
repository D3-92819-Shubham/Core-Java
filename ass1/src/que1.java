import java.util.*;

public class que1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num : ");
		int num = sc.nextInt();
		
		
		String numtobin = Integer.toBinaryString(num);
		
		String numtooctal = Integer.toOctalString(num);
		
		String numtohexal = Integer.toHexString(num);
		
			
		
		System.out.println("Value of num is "+num);
		System.out.println("Value of Binary equivalent is "+numtobin);
		System.out.println("Value of octal equivalent is "+numtooctal);
		System.out.println("Value of Hexadecimal equivalent is "+numtohexal);
		
	}

}
