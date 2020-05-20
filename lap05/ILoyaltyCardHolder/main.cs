using System;
using System.Collections.Generic;
using System.Text;

namespace ILoyaltyCardHolder
{
    class main
    {
        static void Main(string[] args)
        {
            Customer cu1 = new ILoyaltyCardHolder();
            cu1.AddPoint(23);
            cu1.ResetPoints();
            Console.WriteLine(cu1.AddPoint(23));
       
        }
    }
}
