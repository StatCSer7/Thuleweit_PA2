import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int decision = 0;
		double weight;
		double height;
		double BMI;
		
		// Choose which BMI equation to use
		while (decision != 1 || decision != 2){
			System.out.println("Please select which BMI formula you would like to use:");
			System.out.println("(1): weight in pounds, height in inches");
			System.out.println("(2): weight in kilograms, height in meters");
			decision = scnr.nextInt();
			if (decision == 1 || decision == 2) {
				break;
			}
			else {
				System.out.println("That is not a valid choice. Please choose again.");
			}
		}
		
		// Obtain user input for chosen formula
		if (decision == 1) {
			System.out.println("Enter your weight in pounds:");
			weight = scnr.nextDouble();
			System.out.println("Enter your height in inches:");
			height = scnr.nextDouble();
		}
		else {
			System.out.println("Enter your weight in kilograms:");
			weight = scnr.nextDouble();
			System.out.println("Enter your height in centimeters:");
			height = scnr.nextDouble();
		}
		
		// Calculate BMI from input
		if (decision == 1) {
			BMI = (703 * weight) / Math.pow(height, 2);
		}
		else {
			BMI = weight / Math.pow(height / 100, 2);
		}
		
		// Display BMI and BMI categories
		System.out.println("Your BMI is: " + BMI + "\n");
		System.out.println("These BMI categories are from the National Heart Lung and Blood Institute:");
		System.out.println("Underweight: BMI < 18.5");
		System.out.println("Normal weight: 18.5 <= BMI < 25");
		System.out.println("Overweight: 25 <= BMI < 30");
		System.out.println("Obese: BMI >= 30");
		
		// Tell user which BMI category they fall into
		if (BMI < 18.5) {
			System.out.println("\n" + "With a BMI of " + BMI + ", you are underweight");
		}
		else if (18.5 <= BMI && BMI < 25) {
			System.out.println("\n" + "With a BMI of " + BMI + ", you are a normal weight");
		}
		else if (25 <= BMI && BMI < 30) {
			System.out.println("\n" + "With a BMI of " + BMI + ", you are overweight");
		}
		else {
			System.out.println("\n" + "With a BMI of " + BMI + ", you are obese.");
		}
		
		scnr.close();
	}
}