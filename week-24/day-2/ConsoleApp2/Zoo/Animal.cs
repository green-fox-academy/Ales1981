using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2.Zoo
{
    abstract class Animal
    {
        public string Name { get; set; }
        public string Gender { get; set; }
        public string Color { get; set; }
        public int Age { get; set; }

        protected Animal()
        {
        }

        protected Animal(string name, string gender, string color, int age)
        {
            Name = name;
            Gender = gender;
            Color = color;
            Age = age;
        }

        protected Animal(string name)
        {
            Name = name;
        }

        public abstract void Greet();

        public abstract string WantChild();
    }
}
