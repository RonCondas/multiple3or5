/*Need more practice in the multiple 3 and 5 sum*/

import java.util.Scanner;

public class threeOrFIveDemo {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int testNum = 0;
		
		System.out.println("Please enter a number to test");
		
		testNum = kb.nextInt();
		
//		threeOrFive multiple = new threeOrFive(testNum);
//		
//		int size = multiple.getRange(); 
//		
//		
//		System.out.println(size);
		
		int calc1 = c(testNum);
		
		int calc2 = c1(testNum);
	
		int total = sume(calc1, calc2);
		
		System.out.printf("The total of all the multiples of 3 and 5 is: %d", total);
		
		
	}
		public static int c(int testNum) {
		
		int divided = 0; 
		int count = 0;
		
		for(int i = 3; i<=testNum-1; i++) {
			
			divided = i % 5;
			
			if(divided == 0) {
				
				count= count + i;
		
				}
			
		}
		return count;
	}
		public static int c1(int testNum) {
		
		int count1 = 0;
		int divided = 0;
		
		for(int i = 3; i<=testNum-1; i++) {
			
			divided = i % 3;
			
			if(divided == 0) {
				
				count1= count1 + i;
		
				}
			
		}
		return count1;
		}
		public static int sume(int calc1, int calc2) {
			int add = 0;
			add = calc1 + calc2;
			
			
			return add;
			
			
			
		}
		
}