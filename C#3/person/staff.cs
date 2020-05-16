using System;
using System.Collections.Generic;
using System.Text;

namespace Person
{
    class staff:person
    {
        private string rank;
        private double salary;
        private int date;
        public staff(string names,string numberphones,string emails,string rank,double salary,int date) : base(names,numberphones,emails)
        {
            this.rank = rank;
            this.salary = salary;
            this.date = date;
        }
        public string Getsalary()
        {
            double x;
            if(rank== "Faculty")
            {
                if (date >= 3)
                {
                    x = 5 * (1000 + 0.05 * salary);
                }
                else
                {
                    x = 4 * (1000 + 0.05 * salary);
                }
            }
            else
            {
                if(date >= 5)
                {
                    x = 4 * (0.06 * salary);
                }
                else
                {
                    x = 3 * (0.06 * salary);
                }
               
            }
            return "thuong:"+x;
            
        }
       
        public override string ToString()
        {
            return "name staff:" + name + "\n numberphone: " + numberphone + "\n email:" + email + "\nrank: " + rank + "\nsalary: " + salary+ "\ndate:" + date+"\n";
        }
    }
}
