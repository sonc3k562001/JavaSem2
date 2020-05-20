using System;
using System.Collections.Generic;
using System.Text;
using Microsoft.VisualBasic.CompilerServices;

namespace Atom
{
    class Atom
    {
        protected int atomicNumber=1;
        protected string symbol;
        protected string fullName;
        protected double atomicWeight;
        
        public int InfautomicNumber
        {
            get { return atomicNumber; }
            set { atomicNumber = value; }
        }

        public string Infsymbol
        {
            get { return symbol; }
            set { symbol = value; }
        }

        public string inFfullname
        {
            get { return fullName; }
            set { fullName = value; }
        }

        public double infatoWeight
        {
            get { return atomicWeight; }
            set { atomicWeight = value; }
        }
        /*public Atom(int number,string name,string fullnames,double weight)
        {
            this.atomicNumber = number;
            this.symbol = name;
            this.fullName = fullnames;
            this.atomicWeight = weight;
        }*/
        public bool Accepts()
        {
            

            bool a = Convert.ToBoolean(atomicNumber);
            bool b = Convert.ToBoolean(symbol);
            bool c = Convert.ToBoolean(fullName);
            bool d = Convert.ToBoolean(atomicWeight);

            return true;
        }
        public void display()
        {
            Console.WriteLine(atomicNumber +"," + symbol + "," + fullName + "," + atomicWeight);
        }
        static void Main()
        {
            Atom a1 = new Atom();
            a1.Accepts();
            a1.display();
        }

    }
}
