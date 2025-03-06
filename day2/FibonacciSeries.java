package week1.day2;

public class FibonacciSeries {
	
	static void fibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		
		for(int i=0; i < n ; i++) {
			
			System.out.print(num1 +" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;	

		}
	}

	public static void main(String[] args) {
		
		fibonacci(8);
		
	}

}
