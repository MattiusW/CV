using System;
using System.Collections.Generic;

namespace CSharp
{
    class Wisielec
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Zagrajmy w wisielca");
            List<string> lista_slowek = new List<string>();
            lista_slowek.Add("Kot");
            lista_slowek.Add("Pies");
            lista_slowek.Add("Panda");

            Console.WriteLine(lista_slowek[0]);

        }

        public int losowanie(int lista)
        {
            return lista;
        }
    } 

}