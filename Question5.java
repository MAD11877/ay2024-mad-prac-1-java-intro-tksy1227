import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers to be entered: ");
    int n = in.nextInt();

    // Create arrays to store the integers and their frequencies
    int[] numbers = new int[n];
    int[] frequencies = new int[101]; // Assuming integers are between 0 and 100

    // Loop to get the integers from the user and update the frequencies
    for (int i = 0; i < n; i++) {
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        numbers[i] = num;
        frequencies[num]++;
    }

    // Find the mode (number with the highest frequency)
    int mode = 0;
    int maxFrequency = 0;
    for (int i = 0; i < frequencies.length; i++) {
        if (frequencies[i] > maxFrequency) {
            mode = i;
            maxFrequency = frequencies[i];
        }
    }

    // Print the mode
    System.out.println("The mode is: " + mode);
  }
}
