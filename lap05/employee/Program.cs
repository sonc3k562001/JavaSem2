using System;

namespace employee
{
    class Program
    {
        static void Main(string[] args)
        {
            var employee1 = new employee("Liby", 2000);

            var employee2 = new TechnicaEmployee("Zaynah");

            var employee3 = new BusinessEmployee("Winter");

            Console.WriteLine(employee1.employeeStatus() + "..." + employee2.employeeStatus() + "..." +
                employee3.employeeStatus());

        }
    }
}
