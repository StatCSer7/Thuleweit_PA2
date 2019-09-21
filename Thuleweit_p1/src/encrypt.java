import java.util.Scanner;

public class encrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int temp;
		
		// Get each individual digit of the original number
		System.out.println("Enter the four-digit number you would like to encrypt:");
		input = scnr.nextInt();
		digit1 = input / 1000;
		digit2 = input / 100 % 10;
		digit3 = input / 10 % 10;
		digit4 = input % 10;
		
		// Encrypt each digit of the original number
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;
		
		// Switch first and third digits
		temp = digit1;
		digit1 = digit3;
		digit3 = temp;
		
		// Switch second and fourth digits
		temp = digit2;
		digit2 = digit4;
		digit4 = temp;
		
		System.out.println("Encrypted number: " + digit1 + digit2 + digit3 + digit4);
		
		scnr.close();
	}
}