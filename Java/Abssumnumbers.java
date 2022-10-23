import java.util.Scanner;

public class Abssumnumbers 
{
  public static void main(String[] args)
  // Create object which let input value on keyboard by user
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input quantity n: ");
    int n = scanner.nextInt(); // Input value on keyboard
    System.out.println("Input " + n + " numbers");
    int total = 0;
    int a;
    for (int i = 0; i < n; i++) 
    {
      a = scanner.nextInt();  // Input value to varible
      total += Math.abs(a); // Calculate abs sum
    }
    System.out.println("Sum abs: " + total); // print on screen
  }
}