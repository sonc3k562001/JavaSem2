using System;
using System.Collections.Generic;
using System.Text;

namespace Person
{
    public abstract class person
    {
        protected string name;
        protected string numberphone;
        protected string email;
        public person(string name, string numberphone,string email)
        {
            this.name = name;
            this.numberphone = numberphone;
            this.email = email;
        }
        public string PCname
        {
            get { return name; }
            set { name = value; }
        }
        public string PCnumberphone
        {
            get { return numberphone; }
            set { numberphone = value; }
        }
        public string PCemail
        {
            get { return email; }
            set { email = value; }
        }
    }
}
