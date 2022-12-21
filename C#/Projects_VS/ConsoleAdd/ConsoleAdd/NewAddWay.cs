using System;

namespace ConsoleAdd
{
    class NewAddWay
    {
        static void Main(String[] args)
        {
            var table = Enumerable.Range(0, 5)
            .Select(i =>
            {
                Console.WriteLine("Get value");
                return int.Parse(Console.ReadLine());
            })
            .ToList();
            Console.WriteLine("Min value: " + table.Min());
        }
    }
}