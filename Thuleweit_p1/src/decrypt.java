import java.util.Scanner;

public class decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int temp;
		
		// Get each digit of the original number
		System.out.println("Enter the four-digit number you would like to decrypt:");
		input = scnr.nextInt();
		digit1 = input / 1000;
		digit2 = input / 100 % 10;
		digit3 = input / 10 % 10;
		digit4 = input % 10;
		
		// Switch first and third digits
		temp = digit1;
		digit1 = digit3;
		digit3 = temp;
		
		// Switch second and fourth digits
		temp = digit2;
		digit2 = digit4;
		digit4 = temp;
		
		// Decrypt each digit of the original number
		if (digit1 > 6) {
			digit1 -= 7;
		}
		else {
			digit1 = digit1 + (10 - 7);
		}
		if (digit2 > 6) {
			digit2 -= 7;
		}
		else {
			digit2 = digit2 + (10 - 7);
		}
		if (digit3 > 6) {
			digit3 -= 7;
		}
		else {
			digit3 = digit3 + (10 - 7);
		}
		if (digit4 > 6) {
			digit4 -= 7;
		}
		else {
			digit4 = digit4 + (10 - 7);
		}
		
		System.out.println("Decrypted number: " + digit1 + digit2 + digit3 + digit4);
		
		scnr.close();
	}
}