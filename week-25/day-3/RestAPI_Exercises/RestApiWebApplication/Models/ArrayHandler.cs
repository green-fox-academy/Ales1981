using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class ArrayHandler
    {
        public string What { get; set; }
        public int[] Numbers { get; set; }
        public int Result { get; set; }

        public ArrayHandler()
        {
        }

        public ArrayHandler(int result)
        {
            Result = result;
        }

        public ArrayHandler(string what, int[] numbers, int result)
        {
            What = what;
            Numbers = numbers;
            Result = result;
        }
    }
}
