﻿using System;
using System.Collections.Generic;
using System.Text;

namespace GeometricObjectDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            Circle c1 = new Circle(2.45, "blue", 23);
            Console.WriteLine("Circle befor change:" + c1.ToString());

            c1.PColor = "red";
            c1.Pweight = 2.56;

            Console.WriteLine("Circle after change :" + c1.ToString());
            Console.ReadLine();
        }
    }
}
