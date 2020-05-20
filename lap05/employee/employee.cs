using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text;

namespace employee
{
    class employee
    {
        private string employeeName;
        private double employeeBaseSalary;
        private int employeeID;

        public string Name
        {
            get
            {
                return employeeName;
            }

            set
            {
                employeeName = value;
            }
        }
        public double BaseSalary
        {
            get
            {
                return employeeBaseSalary;
            }
            set
            {
                employeeBaseSalary = value;
            }
        }
        public int ID
        {
            get
            {
                return employeeID;

            }
            set
            {
                employeeID = value;
            }
        }
        public employee(string name, double baseSalary)
        {
            this.Name = name;
            this.BaseSalary = baseSalary;
        }
        public double getBaseSalary()
        {
            return this.BaseSalary;
        }public string getName()
        {
            return this.Name;
        }
        private static int employeeCount = 1;
        public employee(int employeeCount)
        {
            this.ID = employeeCount++;
        }
        public int getEmployeeID()
        {
            return this.ID;
        }
        public String toString()
        {
            return this.ID + "\t" + this.Name;
        }

        public virtual String employeeStatus()
        {
            return ToString() + "is in the company's system";
        }

    }
}
