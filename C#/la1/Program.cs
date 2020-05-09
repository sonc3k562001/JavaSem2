using System;

namespace Ex5
{
    class Program
    {
        static void Main(string[] args)
        {
            int x =1;
         for(int i = 1; i <= 20; i++)
            {       
                    x *= i ;
                Console.WriteLine(x);
            }
        }
    }
}
