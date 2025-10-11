
import java.util.*;


public class que3 {
	
	public static int menuList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice: ");
		
		System.out.println("0.Exit");
		System.out.println("1.Add Dosa  $10");
		System.out.println("2.Add Samosa  $20");
		System.out.println("3.Add Idali  $25");
		System.out.println("4.Add Wada  $12");
		System.out.println("5.Show Bill");
		
		return sc.nextInt();
	}

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int dosaprice = 10;
		int samosaprice = 20;
		int idliPrice = 25;
		int wadaprice = 12;
		
		int choice;
		
		int price=0;
		
		
		while((choice=menuList())!=0) {
			
			switch(choice)
			{
			case 1:
				System.out.println("Adding Dosa to Cart");
				System.out.println("Enter the quantity of Dosa: ");
				int dosano = sc.nextInt();
				int amtD = (dosano * dosaprice);
				price = price+amtD;
				
				break;
				
				
			case 2:
				System.out.println("Adding Samosa to Cart");
				System.out.println("Enter the quantity of samosa: ");
				int samosano = sc.nextInt();
				int amtS = (samosano * samosaprice);
				price = price+amtS;
				
				break;
				
			case 3:
				System.out.println("Adding Idali to Cart");
				System.out.println("Enter the quantity of Idali: ");
				int Idalino = sc.nextInt();
				int amtI = (Idalino * idliPrice);
				price = price+amtI;
				
				break;
				
				
			case 4:
				System.out.println("Adding Wada to Cart");
				System.out.println("Enter the quantity of Wada: ");
				int Wadano = sc.nextInt();
				int amtW = (Wadano * wadaprice);
				price = price+amtW;
				
				break;
				
				
			case 5:
				System.out.println("Bill is: ");
				System.out.println("Toatal Bill is: "+price);
				
				break;
			}
			
		}		
	}
}
