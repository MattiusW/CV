using System;
using System.Data;
using System.Linq;

namespace ConsoleMinMax
{
    class MinMaxValue
    {
        static void Main(String[] args)
        {
            // Array of 5 items
            int[] tableWithValue = new int[5]; // Create with lenght new int[5] and now can add value to table

            for (int i = 0; i < tableWithValue.Length; i++)
            {

                Console.WriteLine("Get number");
                // Secure program before input wrong value
                if (Int32.TryParse(Console.ReadLine(), out int number))
                {
                    tableWithValue[i] = number; // Add value
                }
                else
                {
                    Console.WriteLine("You'r getting a wrong value"); // Wrong value
                }
               

            }
            // Format text with System.Linq
            Console.WriteLine($"Min value: {tableWithValue.Min()}");
            Console.WriteLine($"Max value: {tableWithValue.Max()}");
        }

    }
}

