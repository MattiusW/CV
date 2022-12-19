using System;
using System.Collections.Generic; //Uzywanie list
using System.ComponentModel;
using System.Security.Cryptography.X509Certificates;

namespace ConsolePierwszyProjektCS
{
    class PierwszyProgram
    {
        static void Main(string[] args)
        {
            string napis = "Pierwszy program";
            int a = 2;
            decimal b = 20;
            bool zmienna_typu_bool = true;
            int konwertowanieIntaNaString = 5;
            string konwertowanyInt = konwertowanieIntaNaString.ToString(); //Metoda która konwertuje na stringa

            var domyslny = "var - sam dostosowuje typ danych do przypisanej zmiennej";

            while (zmienna_typu_bool)
            {
                var wprowadzenie_klawiatura = Console.ReadLine(); //Wprowadzenie danych z klawiatury przez uzytkownika
                
                if (wprowadzenie_klawiatura == "enter")
                {
                    Console.WriteLine("Wejscie tutaj");
                    break;
                }
                else
                {
                    Console.WriteLine("Wpisz enter");
                    continue;
                }
            }

            for (int i = 0; i < 5; i++)       //Petla for
            {
                Console.WriteLine(i);
            }
            

            var listaInt = new List<int>(); //Lista
            
            for (int j = -10; j <= 0; j++)  //Dodawanie elementow do listy
                listaInt.Add(j);

            Console.WriteLine(napis);
            Console.WriteLine(a + b);
            Console.WriteLine(domyslny);
            Console.WriteLine(konwertowanyInt);
            Console.WriteLine(listaInt[9]);
            FunkcjaPrzemnozenia(5);
            FunkcjaPrzemnozenia(0);
            Console.WriteLine(FunkcjaDodawania(3, 6, 1));
            FunkcjaPrzyjmujacaWieleArgumentow("Pierwszy argument", "Drugi argument", "Ten mi wypisz", "Ostatni argument");
        }

        static void FunkcjaPrzemnozenia(int x)
        {
            int wynik = 1;
            if (x != 0)
            {
                for (int i = 1; i <= 10; i++)
                {
                    wynik = x * i;
                    Console.WriteLine(wynik);
                }    
            }
            else
                Console.WriteLine("Bez sensu mnozyc przez 0. Wszystko bedzie 0");
       
        }
        static int FunkcjaDodawania(int x, int y, int z)
        {
            return x + y + z;
        }

        static void FunkcjaPrzyjmujacaWieleArgumentow(params string[] strings) //Przyjmowanie wielu argumentow
        {
            Console.WriteLine(strings[2]);
        }
    }
}