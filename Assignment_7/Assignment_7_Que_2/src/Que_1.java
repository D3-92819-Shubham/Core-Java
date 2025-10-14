
public class Que_1 {
	
	

	public static <T extends Number> void minOfArray(T...arr) {

	   T num = (T) arr[0];
       for (int i = 1; i < arr.length; i++) {
			T ele = (T) arr[i];
			
			if (num.intValue() > ele.intValue()) {
				num = ele;
			}
		}
		
		System.out.println("min value in array is : " + num);
		
		
	}
	
	public static void main(String[] args) {
		Integer [] arr = new Integer[6];
		arr[1] = new Integer(10);
		arr[2] = new Integer(20);
		arr[3] = new Integer(5);
		arr[4] = new Integer(30);
		arr[5] = new Integer(40);
		arr[0] = new Integer(50);
		
		
		Que_1.<Integer>minOfArray(arr);
		Que_1.<Double>minOfArray(10.0, 12.3, 44.45, 54.22, 55.32);
		
	
		
		
	}

}
