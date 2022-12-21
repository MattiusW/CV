using System;
using System.Data;

namespace ConsoleNajwieksza
{
    class NajwiekszaInajmniejsza
    {
        static void Main(String[] args)
        {
            int[] tablica = { 0, 0, 0 };
            int i = 0;

            for (; i < 3; i++)
            {
                
                int liczba = Convert.ToInt32(Console.ReadLine());
                tablica[i] += liczba;

            }

            Console.WriteLine(tablica.Min());
            Console.WriteLine(tablica.Max());
        }

    }
}

