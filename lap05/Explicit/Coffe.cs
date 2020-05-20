using System;
using System.Collections.Generic;
using System.Text;

namespace Explicit
{
    public class Coffe : IBeverage
    {
        private int servingTempWithoutMilk { get; set; }
        private int servingTempWithMilk { get; set; }
        public int GetServingTemperature(bool includesMilk)
        {
            if (includesMilk)
            {
                return servingTempWithMilk;
            }
            else
            {
                return servingTempWithoutMilk;
            }
        }
        public bool IsFairTrade {get; set;}
        }
}

