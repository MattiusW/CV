import java.util.Scanner;

public class Suminputnumbers
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in); // Create object which let input value on keyboard by user
    System.out.print("Input quantity n = ");
    int n = scanner.nextInt(); // Input value on keyboard
    System.out.println("Input " + n + " numbers");
    int total = 0;
    int a;
    for (int i = 0; i < n; i++) 
    {
      a = scanner.nextInt(); // Input value to varible
      total += a; // calculate sum
    }
    System.out.println("Sum of numbers is : " + total); // Print on screen
  }
}