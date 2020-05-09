using System;

namespace ex4
{
    class Ex4
    {
        static void Main(string[] args)
        {
            int a,x;
            do
            {
                Console.WriteLine("enter your number:");
                a = int.Parse(Console.ReadLine());
                for(int i = 1; i < 11; i++)
                {
                    x = a * i;
                    Console.WriteLine(a + "*" + i + "=" + x);
                }
            } while (a != 0);
        }
    }
}
