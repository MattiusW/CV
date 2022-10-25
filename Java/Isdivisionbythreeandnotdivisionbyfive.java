import java.util.Scanner; // Improt keyboard module

public class Isdivisionbythreeandnotdivisionbyfive 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //input keyboard module
        System.out.print("Input number: ");
        int n = scanner.nextInt(); // assignment scanner to variable
        System.out.println("Input " + n + " number");
        int divisionByThreeAndnotDivisionByFive = 0;
        int a;
        for(int i = 0; i < n; i++) 
        {
            a = scanner.nextInt();
            if (a % 3 == 0 && a % 5 != 0) // Check condition
            {
                divisionByThreeAndnotDivisionByFive++; // increment variable
            }
        }
        
        System.out.println("Total number division by 3 and not division by 5 is: " + divisionByThreeAndnotDivisionByFive); // Print on screen
    
    } 

}
