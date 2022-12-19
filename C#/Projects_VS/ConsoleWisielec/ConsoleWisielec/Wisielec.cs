using System;
using System.Collections;
using System.Collections.Generic;
using System.Globalization;
using System.Reflection.Metadata.Ecma335;
using System.Runtime.InteropServices;

namespace ConsoleWisielec
{
    class Wisielec
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Zagrajmy w wisielca");
            string[] lista = { "kot", "pies", "panda", "krowa" , "lew", "tygrys", "papuga", "krokodyl", "kameleon"};
            Random rnd = new Random();
            int los = rnd.Next(0, lista.Length);
            string x = lista[los];
            //Console.WriteLine(x);
            var rozdzielone_slowo = x.ToCharArray();
            gra(rozdzielone_slowo);
        }
        static void gra(char[] slowo)
        {
            Console.WriteLine("Zgadnij o jakim zwierzeciu mysle zaczyna sie na: " + slowo[0] + " konczy sie na: " + slowo[slowo.Length - 1]); //Wyswietlanie ostatniego elementu
            int szanse = 3;
            
            for (szanse = 3; szanse > 0; szanse--)
            {
                Console.WriteLine("Masz: " + szanse + " szanse");
                string caleSlowo = new string(slowo);
                var zgadywane = Console.ReadLine();

                if (String.Equals(zgadywane, caleSlowo))
                {
                    Console.WriteLine("Dobrze to " + caleSlowo + " wygrales!");
                    break;
                }
                else
                {
                    Console.WriteLine("To nie to sprobuj ponownie");
                    continue;
                }
            }
            
            if (szanse == 0)
                Console.WriteLine("Przegrałeś wiszisz na szubienicy!");  
        }
    }
}