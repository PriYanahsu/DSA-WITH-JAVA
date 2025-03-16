import java.util.Scanner;
import java.text.DecimalFormat;

    public class findNumberSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your workout log:");
            String input = sc.nextLine(); // Taking user input

            String[] words = input.split(" "); // Splitting input by spaces
            int total = 0, count = 0;

            for (String word : words) {
                if (isNumber(word)) {  // Check if the word is a number
                    int num = Integer.parseInt(word);
                    total += num;
                    count++;
                }
            }

            // Compute average
            double average = count > 0 ? (double) total / count : 0;

            // Formatting to 2 decimal places
            DecimalFormat df = new DecimalFormat("0.00");

            // Output
            System.out.println("Total: " + total);
            System.out.println("Average: " + df.format(average));
        }

        // Function to check if a string is a number
        public static boolean isNumber(String str) {
            for (char c : str.toCharArray()) {
                if (!Character.isDigit(c)) return false; // If any character is not a digit, return false
            }
            return !str.isEmpty(); // Ensure it's not an empty string
        }
    }
