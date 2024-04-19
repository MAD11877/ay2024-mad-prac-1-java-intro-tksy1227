import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = in.nextInt();

    // Loop to iterate from n to 1
    for (int i = num; i > 0; i--){
      // Loop to iterate '*' in each row
      for (int j = 0; j < i; j++){
        System.out.print("*");
      }
      // Move to the next line after each row
      System.out.println();
    }
  }
}
