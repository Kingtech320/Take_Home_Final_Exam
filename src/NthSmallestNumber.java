import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

    public static int nthSmallest(int[] numbers, int n) {
        Arrays.sort(numbers);
        if (n <= numbers.length) {
            return numbers[n - 1];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] randomNumbers = new int[500];
        Random rand = new Random();

        // Generate 500 random numbers between 1 and 2000
        for (int i = 0; i < 500; i++) {
            randomNumbers[i] = rand.nextInt(2000) + 1;
        }

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter N to find the Nth smallest number: ");
			int nValue = scanner.nextInt();

			int result = nthSmallest(randomNumbers, nValue);

			if (result != -1) {
			    System.out.println("The " + nValue + "th smallest number is: " + result);
			} else {
			    System.out.println("The value of N is out of range.");
			}
		}
    }
}