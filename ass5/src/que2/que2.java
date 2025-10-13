package que2;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Shubham");
		
		StringBuffer sb1 = new StringBuffer();
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch = s1.charAt(i);
			sb1.append(ch);
		}
		System.out.println("Original String is: "+s1);
		System.out.println("Reverse String is: "+sb1);
		
		if(s1.equals(sb1.toString()))
		{
			System.out.println("Palindrom");
		}
		
		else
			System.out.println("no Palindrom");
	}

}
