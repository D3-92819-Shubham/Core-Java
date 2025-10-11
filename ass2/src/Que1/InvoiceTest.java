package Que1;
import java.util.*;
public class InvoiceTest extends Invoice {
	
		// TODO Auto-generated method stub
		
		public void acceptData()
		{
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter the data of Parts: ");
			System.out.println("Enter the Part no: ");
			String s1 = sc.nextLine();
			this.setPartno(s1);
			
			
			
			System.out.println("Enter the Desc of Part: ");
			String s2 = sc.nextLine();
			this.setPartdesc(s2);
			
			
			System.out.println("Enter the quantity: ");	
			int i = sc.nextInt();
			
			if(i<0)
			{
				this.setQuantity(0);
			}
			else
				this.setQuantity(i);
			
			System.out.println("Enter the Price: ");
			double price = sc.nextDouble();
			
			if(price<0)
			{
				this.setPrice(0.0);
			}
			this.setPrice(price);
			
			
		}
		
		public void printBill()
		{
			Scanner sc = new Scanner(System.in);
			
			double bill = (this.getPrice() * this.getQuantity());
			
			System.out.println("Part no :- "+this.getPartno());
			System.out.println("Desc of Part :- "+this.getPartdesc());
			System.out.println("Qunatity of Part :- "+this.getQuantity());
			System.out.println("The bill is : "+ bill);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			InvoiceTest i1 = new InvoiceTest();
			
			i1.acceptData();
			i1.printBill();
			
		
		}

}
