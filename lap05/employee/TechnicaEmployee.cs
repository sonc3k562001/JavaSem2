using System;
using System.Collections.Generic;
using System.Security.Cryptography.X509Certificates;
using System.Text;

namespace employee
{
    class TechnicaEmployee: employee
    {
        public TechnicaEmployee(String name) : base(name, 75000)
        {

        }
        public int succesfullCheckIns = 5;
        public override string employeeStatus()
        {
            return this.toString() + "has" + this.succesfullCheckIns + "successful check ins";
        }
    }
}
