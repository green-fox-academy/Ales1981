using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class Doubling
    {
        public int Received { get; set; }
        public int Result { get; set; }

        public Doubling()
        {
        }
       
        public Doubling(int received)
        {
            this.Received = received;
            this.Result = received * 2;
        }

        public Doubling(int received, int result)
        {
            this.Received = received;
            this.Result = result;
        }
    }
}
