using System;
using System.Collections.Generic;
using System.Text;

namespace Person
{
    class student:person
    {
        private string subjects;
   
        public student(string name,string numberphone,string email,string subjects): base(name,numberphone,email)
        {
            this.subjects = subjects;
        }
        public override string ToString()
        {
            return "name student:" + name + "\n numberphone:" + numberphone +"\n email:"+email+"\n subject"+subjects;
        }
    }
}
