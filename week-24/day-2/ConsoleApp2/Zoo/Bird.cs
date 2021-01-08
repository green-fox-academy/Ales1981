using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2.Zoo
{
    class Bird : Animal
    {
        public int WingSpan { get; set; }
        public int Weight { get; set; }
        public Bird()
        {
        }

        public Bird(int wingSpan, int weight, string name) : base(name)
        {
            WingSpan = wingSpan;
            Weight = weight;
        }


        public override void Greet()
        {
            Console.WriteLine("Hello to you says bird named  "+this.Name+".");
        }

        public override string WantChild()
        {
            return "Bird wants child from an egg.";
        }
    }
}
