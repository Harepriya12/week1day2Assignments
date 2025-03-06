package week1.day2;


public class PalindromeNumber {

	public static void main(String[] args) {
		      
		int input = 121; 
        int output = 0;  
     
        // Reverse the number using a for loop  
        
        for ( int temp = input; temp > 0; temp /= 10) {
            int rem = temp % 10;        // Extract last digit
            output = output * 10 + rem; // Append digit to reversed number
        }

        // Check if the number is a palindrome
        if (input == output) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

	}

}

