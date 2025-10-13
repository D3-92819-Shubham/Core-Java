package que1;

public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Shubham");
		
		String s2 = "mahbuhS";
		
	
		//int i1 = s1.length();
		//System.out.println(i1);
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch = s1.charAt(i);
			
			System.out.print(ch);
		}
		
		System.out.println();
		
		for(int i=s2.length()-1; i>=0; i--)
		{
			char ch = s2.charAt(i);
			
			System.out.print(ch);
		}
		
		
	}
}
