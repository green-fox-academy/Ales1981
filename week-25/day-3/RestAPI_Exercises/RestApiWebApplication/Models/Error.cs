using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class Error
    {
        public string error { get; set; }

        public Error()
        {
        }

        public Error(string someError)
        {
            error = someError;
        }
    }
}
