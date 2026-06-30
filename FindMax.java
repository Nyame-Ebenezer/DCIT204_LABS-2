import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for the array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Read array elements
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Assume the first element is the maximum
        int max = numbers[0];
        int maxIndex = 0;

        // Find the maximum value and its index
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // Display the result
        System.out.println("\n========== RESULT ==========");
        System.out.println("Maximum value : " + max);
        System.out.println("Index         : " + maxIndex);

        scanner.close();
    }
}