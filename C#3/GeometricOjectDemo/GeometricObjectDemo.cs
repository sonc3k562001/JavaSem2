using System;
using System.Reflection.Metadata.Ecma335;

namespace GeometricObjectDemo
{
    public abstract class GeometricObjectDemo
    {
        protected string color;
        protected double weight;
        protected GeometricObjectDemo()
        {
            color = "white";
            weight = 1.0;
        }
        protected GeometricObjectDemo(string color,double weight)
        {
            this.color = color;
            this.weight = weight;
        }
        public string PColor
        {
            get { return color; }
            set { color = value; }
        }
        public double Pweight
        {
            get { return weight; }
            set { weight = value; }
        }
        public abstract double findArea();
        public abstract double findPerimeter();
      
    }
}
