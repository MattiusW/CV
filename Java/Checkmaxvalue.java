import java.util.Scanner;

public class Checkmaxvalue 
{
    public static void main(String[] args)
  {
      Scanner scanner = new Scanner(System.in); //Input value on keybord
      System.out.print("Podaj n: ");
      int n = scanner.nextInt(); //Number of entries input by user
      int min = 0;
      int max = 0;
      for (int i = 0; i < n; i++) // For loop performing n times
      {
          int liczba = scanner.nextInt(); //Input next value
          if (i == 0) //Check number is equal nil
          {
            min = liczba;
            max = liczba; 
          }
          else
          {
            if (liczba > max) //Check if the number is greater or less
                max = liczba;
            else
                min = liczba; 
          }  
      }
      System.out.println("Max liczba: " + max); //Print max value
  }
}
