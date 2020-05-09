using System;
using System.Runtime.InteropServices;

namespace Data_type
{
	class ex3
	{
		static void Main(string[] args)
		{
			int a;
			do
			{
				Console.WriteLine("please enter a day(1-7)");
				 a = int.Parse(Console.ReadLine());
				switch (a)
				{
					case 1:
						Console.WriteLine("t2");
						break;
					case 2:
						Console.WriteLine("t3");
						break;
					case 3:
						Console.WriteLine("t4");
						break;
					case 4:
						Console.WriteLine("t5");
						break;
					case 5:
						Console.WriteLine("t6");
						break;
					case 6:
						Console.WriteLine("t7");
						break;
					case 7:
						Console.WriteLine("Chu nhat");
						break;
					default:
						Console.WriteLine("bye");
						break;
				}
			}while (0<a && a <8);
		}
		
	}
}
