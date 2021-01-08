using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2.Zoo
{
    class Mammal : Animal
    {
        public int Height { set; get; }
        public int Weight { set; get; }
        public string EyeColor { set; get; }
        public Mammal(int height, int weight, string eyeColor)
        {
            Height = height;
            Weight = weight;
            EyeColor = eyeColor;
        }

        public Mammal(string name, string gender, string color, int age) : base(name, gender, color, age)
        {
        }

        public override void Greet()
        {
            Console.WriteLine("Hello to you says bird named  " + this.Name + ".");
        }

        public override string WantChild()
        {
            return "Mammal wants child from an uterus.";

        }
    }
}
