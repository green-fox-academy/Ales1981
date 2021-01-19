using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Models
{
    public class Groot
    {
        public string Received { get; set; }
        public string Translated
        {
            get
            {
                return "I am Groot!";
            }
        }

        public Groot()
        {
        }

        public Groot(string received)
        {
            Received = received;
        }

        // added
        public override bool Equals(object obj)
        {
            var g = (Groot)obj;
            return base.Equals(g);
        }
    }
}
