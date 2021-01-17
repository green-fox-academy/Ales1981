using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class Append
    {
        public string Appended { get; set; }

        public Append()
        {
        }

        public Append(string appended)
        {
            Appended = appended + "a";
        }
    }
}
