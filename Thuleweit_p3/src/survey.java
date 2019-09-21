import java.util.Scanner;

public class survey {

	public static void main(String[] args) {
		final int NUM_TOPICS = 5;
		final int NUM_RATINGS = 10;
		final int NUM_RESPONDENTS = 5;
		Scanner scnr = new Scanner(System.in);
		String[] topics = new String[NUM_TOPICS];
		int[][] responses = new int[NUM_TOPICS][NUM_RATINGS];
		int[] topicSum = new int[NUM_TOPICS];
		int rating;
		int maxTotal, maxIndex;
		int minTotal, minIndex;
		int i;
		int j;
		
		// Topics I find important
		topics[0] = "Climate";
		topics[1] = "Education";
		topics[2] = "Religion";
		topics[3] = "Abortion";
		topics[4] = "Gun Control";
				
		System.out.println("Rate the following topics from 1 to 10.");
		System.out.println("1 is not important at all. 10 is very important.");
		
		// Allow five users to rate each topic
		for (i = 0; i < NUM_RESPONDENTS; i++) {
			for (j = 0; j < NUM_TOPICS; j++) {
				System.out.println(topics[j]);
				rating = scnr.nextInt();
				while (rating < 1 || rating > 10) {
					System.out.println("That is not a valid rating. Please try again.");
					rating = scnr.nextInt();
				}
				responses[j][rating-1] += 1;
				topicSum[j] += rating;
			}
		}
		System.out.println("");
		
		// Row with each rating
		System.out.println("SUMMARY OF RESULTS:");
		System.out.print("Ratings" + "     ");
		for (i = 0; i < NUM_RATINGS; i++) {
			System.out.print((i + 1) + "  ");
		}
		System.out.print("Avg.");
		System.out.println("");
		
		// Results for "Climate"
		System.out.print(topics[0] + "     ");
		for (i = 0; i < NUM_RATINGS; i++) {
			System.out.print(responses[0][i] + "  ");
		}
		System.out.println(" " + (topicSum[0] / 5));
		
		// Results for "Education"
		System.out.print(topics[1] + "   ");
		for (i = 0; i < NUM_RATINGS; i++) {
			System.out.print(responses[1][i] + "  ");
		}
		System.out.println(" " + (topicSum[1] / 5));
		
		// Results for "Religion"
		System.out.print(topics[2] + "    ");
		for (i = 0; i < NUM_RATINGS; i++) {
			System.out.print(responses[2][i] + "  ");
		}
		System.out.println(" " + (topicSum[2] / 5));
		
		// Results for "Abortion"
		System.out.print(topics[3] + "    ");
		for (i = 0; i < NUM_RATINGS; i++) {
			System.out.print(responses[3][i] + "  ");
		}
		System.out.println(" " + (topicSum[3] / 5));
		
		// Results for "Gun Control"
		System.out.print(topics[4] + " ");
		for (i = 0; i < NUM_RATINGS; i++) {
			System.out.print(responses[4][i] + "  ");
		}
		System.out.println(" " + (topicSum[4] / 5));
		
		// Find topic with most and least points
		maxTotal = minTotal = topicSum[0];
		maxIndex = minIndex = 0;
		for (i = 1; i < NUM_TOPICS; i++) {
			if (topicSum[i] < minTotal) {
				minTotal = topicSum[i];
				minIndex = i;
			}
			if (topicSum[i] > maxTotal) {
				maxTotal = topicSum[i];
				maxIndex = i;
			}
		}
		
		System.out.println("With " + maxTotal + " points, " + topics[maxIndex] + " is the most important issue.");
		System.out.println("With " + minTotal + " points, " + topics[minIndex] + " is the least important issue.");
		
		scnr.close();
	}
}