using System;

namespace Person
{
    class Program
    {
        static void Main(string[] args)
        {
            student st1 = new student("Nguyen van A", "0939549325", "angaongo2gmail.com", "IT");

            staff sta3 = new staff("tran thi K", "0383854", "buitronthe@gmail.com","Faculty", 1200.0,2);
            staff sta2 = new staff("tran thi t", "0383854", "buitronthe@gmail.com", "staff", 1200.0, 5);
            staff sta1 = new staff("tran thi B", "0383854", "buitronthe@gmail.com", "staff", 1200.0, 1);
            staff sta4 = new staff("tran thi C", "0383854", "buitronthe@gmail.com", "Faculty", 1200.0, 6);
            Console.WriteLine(st1.ToString());

            Console.WriteLine(sta1.ToString());
            Console.WriteLine(sta1.Getsalary());

            Console.WriteLine(sta2.ToString());
            Console.WriteLine(sta2.Getsalary());

            Console.WriteLine(sta3.ToString());
            Console.WriteLine(sta3.Getsalary());

            Console.WriteLine(sta4.ToString());
            Console.WriteLine(sta4.Getsalary());
        }
    }
}
