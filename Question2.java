import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Height in cm:");
    double height = (in.nextDouble() / 100);
    System.out.print("Weight in kg:");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.println(bmi); // Output only the BMI value
  }
}
