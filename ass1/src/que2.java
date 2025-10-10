import java.util.Scanner;

public class que2 {

	public static void main(String[] args) 	{
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Enter the num1: ");
		if(sc.hasNextDouble() && !(sc.hasNextInt()))
		{
			n1 = sc.nextDouble();
		}
		else
		{
			System.out.println("Error input num1 is not double");
			
			return;
		}
		
		
		System.out.println("Enter the NUm2: ");
		if(sc.hasNextDouble() && !(sc.hasNextInt()))
		{
			n2=sc.nextDouble();
		}
		else
		{
			System.out.println("Errro input num2 is not double");
			
			return;
		}
		
		
		double avg = (n1+n2)/2;
		
		
		System.out.println("Avg of num1 and num2 is : " +avg);
		
		
		
		
	}

}
