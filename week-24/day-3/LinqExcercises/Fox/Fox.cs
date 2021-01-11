using System;
using System.Collections.Generic;
using System.Text;

namespace LinqExcercises.Fox
{
    class Fox
    {
        public string Name { get; set; }
        public string Type { get; set; }
        public string Color { get; set; }
        public Fox()
        {
        }

        public Fox(string name, string type, string color)
        {
            Name = name;
            Type = type;
            Color = color;
        }
    }
}
