import java.util.Scanner;

public class Quotientinputnumbers
{
 public static void main(String[]args)
  {
    Scanner scanner = new Scanner(System.in); // Create object which let input value on keyboard by user
    System.out.print("Input quantity n = "); 
    int n = scanner.nextInt(); // Input value on keyboard
    System.out.println("Input " + n + " numbers");
    double iloczyn = 1; // Need value != 0
    int a;
    for (int i = 0; i < n ; i ++)
    {
      a = scanner.nextInt();   // Input value to varible
      iloczyn *= a; // Calculate quotient
    }
    System.out.println("Quotient of numbers is: " + iloczyn);
  }  
}