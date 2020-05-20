using System;

namespace epkieu
{
    class Program
    {
        

        static void Main(string[] args)
        {
            int myInt = 2924802;
            long mylong = myInt;
            Console.WriteLine(myInt + "->" + mylong);

            double myDouble = 1234.5;
            int my_int;
            my_int = (int)myDouble;
            Console.WriteLine(myDouble + "-->" + my_int);

            myInt = Convert.ToInt32(myDouble);
            Console.WriteLine(myDouble +"-->"+ myInt);
           
           
        }
    }
}
