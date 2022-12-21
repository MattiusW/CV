using System;
using System.Security.Cryptography.X509Certificates;

namespace ConsoleString
{
    class Strings
    {
        static void Main(String[] args)
        {
            Console.WriteLine("Proba mikrofonu");
            string[] losowanieZwierzat = { "pies", "kot", "ptak" }; //Tablica string do losowania
            string wylosowany = losowanieStringa(losowanieZwierzat); //Wylosowanie poprzez metode
            Console.WriteLine(wylosowany); //Sprawdzanie losowania
            var stringDoZgadniecia = podmianaLiter(wylosowany);
            Console.WriteLine(podmianaLiter(stringDoZgadniecia));
        }

        static string losowanieStringa(string[] lista)
        {
            Random rnd = new Random();
            int los = rnd.Next(0, lista.Length);
            string x = lista[los];
            return x;
        }

        static string podmianaLiter(string slowo)
        {
            string noweSlowo = "";
            for (int i = 0; i < slowo.Length; ++i)
            {
                noweSlowo += "_";
            }
            Console.WriteLine(noweSlowo);

            char litera = 'p';
            bool czyLiteraWystepuje = slowo.Contains(litera);

            if (czyLiteraWystepuje == true)
            {
                Console.WriteLine("Wystepuje");
                for (int i = 0; i < noweSlowo.Length; i++)
                {
                    noweSlowo = "";
                    noweSlowo += litera;
                    Console.WriteLine(noweSlowo);
                }
            }
            else
                Console.WriteLine("Sprobuj ponownie");
            
            return noweSlowo;

        }
    }

}
