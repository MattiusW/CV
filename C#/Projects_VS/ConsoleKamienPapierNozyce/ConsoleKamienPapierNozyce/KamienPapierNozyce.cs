using System;

namespace ConsoleKamienPapierNozyce
{
    class KamienPapierNozyce
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Zagraj ze mna w kamien papier nozyce");
            gra();

        }

        static void gra()
        {
            Random rand = new Random();
            int randKomp = rand.Next(1, 3);
            
            Console.WriteLine("Wybierz: 1.kamien, 2.papier, 3.nozyce");

            while (true)
            {
                var wybor = Console.ReadLine();
                int wyborLiczby;
                //Console.WriteLine("Sprawdzanie randoma: " + randKomp);

                if (int.TryParse(wybor, out wyborLiczby))
                {
                    if (wyborLiczby == 1 || wyborLiczby == 2 || wyborLiczby == 3)
                    {
                        Console.WriteLine("Dobry wybor, gramy!");

                        if (wyborLiczby == randKomp)
                            Console.WriteLine("Mamy remis Twoj wybor: " + wyborLiczby + " Moj wybor to: " + randKomp);
                        else if (wyborLiczby == 1 && randKomp == 3 || wyborLiczby == 2 && randKomp == 1 || wyborLiczby == 3 && randKomp == 2)
                            Console.WriteLine("Wygrales! Twoj wybor: " + wyborLiczby + " Moj wybor to: " + randKomp);
                        else
                            Console.WriteLine("Przegrales! Twoj wybor: " + wyborLiczby + " Moj wybor to : " + randKomp);
                      
                        break;
                    }
                    else
                    {
                        Console.WriteLine("Ma byc liczba od 1 do 3");
                        continue;
                    }
                }
                else
                    Console.WriteLine("Podano nieprawidlowa wartosc. Sprobuj ponownie");
            }
        }
    }
}