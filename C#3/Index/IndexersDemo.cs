using System;

namespace IndexersDemo
{
    class IndexeExample
    {
        public int[] inList = new int[10];
        public int this[int index]
        {
            get { return inList[index]; }
            set { inList[index] = value; }
        }
    }
    class IndexersDemo
    {
        static void Main(string[] args)
        {
            int i, j = 0;
            IndexeExample indexTest = new IndexeExample();
            for(i = 1;i<10;i += 2)
            {
                indexTest[j] = i;
                j++;
            }
            for(i = 0; i < 5; i++)
            {
                Console.WriteLine("indexTest[{0}] is {1}", i, indexTest[i]);
            }
            Console.ReadLine();
        }
    }
}
