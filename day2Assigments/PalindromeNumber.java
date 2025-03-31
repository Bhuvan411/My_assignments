package week1.day2Assigments;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input = 121;  
        int original = input; 
        int output = 0; 

        
        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10; 
            output = (output * 10) + rem; 
        }

        
        if (original == output) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }
    

	}

}
