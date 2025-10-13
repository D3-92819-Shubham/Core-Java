package que3;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("   Shubham Have RE 350 Bike  ");
		
		System.out.println(s1);
		String s2 = s1.trim();
		
		System.out.println(s2);
		
		
		
		String[] s3 = s2.split(" ");
		
		int len = s3.length;
		
		System.out.println("Number of words are: "+len);
		
		for(int i=0; i<len; i++)
		{
			System.out.print(s3[i]);
		}
		
		
		

	}

}
