import java.util.Scanner;

public class Sqrtabssumnumbers {
  public static void main(String[] args)
  // Create object which let input value on keyboard by user
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input quantity n = "); 
    int n = scanner.nextInt(); // Input value on keyboard
    System.out.println("Input " + n + " numbers");
    double total = 0;
    double a;
    for (int i = 0; i < n; i++) 
    {
      a = scanner.nextInt(); // Input value to varible
      total += Math.sqrt(Math.abs(a)); // calculate sum abs sqrt
    }
    System.out.println("Sum numbers abs sqrt: " + total); // Print on screen
  }
}