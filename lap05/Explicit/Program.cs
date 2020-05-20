using System;

namespace Explicit
{
    class Program
    {
        static void Main(string[] args)
        {
            Coffe coffee1 = new Coffe();
            IBeverage coffee2 = new Coffe();

            IBeverage beverage = coffee1;

            Coffe coffee3 = beverage as Coffe;
            Coffe coffee4 = (Coffe)beverage;

            Console.WriteLine(coffee1);
            Console.WriteLine(coffee2);
            Console.WriteLine(coffee3);
            Console.WriteLine(coffee4);
            Console.WriteLine(beverage);
        }
    }
}
