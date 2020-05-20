using System;
using System.Collections.Generic;
using System.Text;

namespace employee
{
    class BusinessEmployee:employee
    {
        public BusinessEmployee(String name) : base(name, 50000)
        {

        }
        public double bounusBudget = 1000;
        public override string employeeStatus()
        {
            return toString() + "with a budget of" + this.bounusBudget;
        }
    }
}
