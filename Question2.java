import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Height in cm:");
    double height = (in.nextDouble()/100);
    System.out.print("Weight in kg:");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.println("BMI: "+bmi);
  }
}
