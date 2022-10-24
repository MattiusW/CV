import java.util.Scanner; // Import input by keyboard module

public class Oddhowmany 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Load input keyboard module
        System.out.print("Input quantity n: "); 
        int n = scanner.nextInt(); // assignment scanner to variable
        System.out.println("Input " + n + " number");
        int odd = 0;
        int a;
        for (int i = 0; i < n; i++)
        {
            a = scanner.nextInt();
            if (a % 2 != 0) // Check if value not give rest from division modulo
            {
                odd += 1; // Count once odd number
            }
        }
        System.out.println("Odd numbers: " + odd); // Print result odd numbers
    }            
}
