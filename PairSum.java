import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for the array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Read the array elements
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Ask for the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Brute-force search using nested loops
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {

                if (numbers[i] + numbers[j] == target) {

                    System.out.println("\n========== RESULT ==========");
                    System.out.println("Pair found!");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values : " + numbers[i] + " and " + numbers[j]);
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found with the given target sum.");
        }

        scanner.close();
    }
}