using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class DoUntil
    {
        public int Until { get; set; }
        public int Result { get; set; }

        public DoUntil()
        {
        }

        public DoUntil(int until, int result)
        {
            Until = until;
            Result = result;
        }
    }
}
