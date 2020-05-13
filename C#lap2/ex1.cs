using System;

namespace ex2_1
{
    class ex1
    {
        static void Main(string[] args)
        {
            DateTime now = DateTime.Now;
            Random rand = new Random((int)now.Millisecond);
            int[] Arr = new int[10];
            for(int x = 0; x < Arr.Length; ++x)
            {
                Arr[x] = rand.Next() % 100;
            }
            int Total = 0;
            Console.Write("Arrray value are\t");
            foreach (int val in Arr)
            {
                Total += val;
                Console.Write(val + ", ");
            }
            Console.WriteLine("\nAnd the average is {0,0:f2}",
                (double)Total/(double)Arr.Length);
            Console.ReadLine();
        }
    }
}
