using System;
using System.Collections.Generic;
using System.Text;

namespace Explicit
{
    public interface IBeverage
    {
        int GetServingTemperature(bool includesMilk);
        bool IsFairTrade { get; set; }
       
    }
}
