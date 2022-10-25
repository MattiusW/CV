import java.util.Scanner; // pobranie modułu umożliwiającego wprowadzania danych z klawiatury

public class Dodawanieimnozenia 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // zaimplementowanie modułu scanner
        System.out.print("Wpisz ilość wprowadzanych liczb n: ");
        int n = scanner.nextInt(); // zaimplementowanie modułu scannera do zmiennej n
        System.out.println("Wprowadź " + n + " liczb");
        int suma = 0;
        int iloraz = 1;
        int wynik = 0;
        int a;

        for (int i = 0; i < n; i ++)
        {
            a = scanner.nextInt();
            suma += a; // dodanie wprowadzonej liczby
            iloraz *= a; // pomnożenie wprowadzonej liczby
        }
        wynik = suma + iloraz; // dodanie sumy i ilorazu do zmiennej wynik
        System.out.println("Suma: " + suma + " Iloraz: " + iloraz + " Wynik dodawania i mnożenia: " + wynik);
    }
}
