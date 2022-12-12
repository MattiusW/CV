package zegarek;

import java.util.Scanner;

public class Main {
  public static void main(String []args)
  {
    Zegarek z1 = new Zegarek(1, 20, 30);
    System.out.print("zm1: ");
    z1.wypisz();    
    // użytkowni podaje liczbę sekund 
    z1.zmienSec(29);
    System.out.print(" zm2: ");
    z1.wypisz();
    z1.zmienSec(11);
    System.out.println(); //przejscie do nowego wiersza
    System.out.print("zm3: ");
    z1.wypisz();
    System.out.println();
    /*if (z1.ustawGodz(44) == false)
    {
      System.exit(-1); //Liczba różna od zera oznacza błąd
    }
    */
    int godzina = 0;
    System.out.println("Podaj godzinę: ");
    Scanner scanner = new Scanner(System.in);
    godzina = scanner.nextInt();
    while (z1.ustawGodz(godzina) == false)
    {
      System.out.println("Podaj nową godzinę: ");
      godzina = scanner.nextInt();
    }
    System.out.print("zm4: ");
    z1.wypiszln();
    System.out.println("Koniec programu");    
  }
}