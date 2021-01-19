using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Models
{
    public class ErrorObj
    {
        public string Error { get; set; }

        public ErrorObj()
        {
        }

        public ErrorObj(string error)
        {
            Error = error;
        }

        public override bool Equals(object obj)
        {
            var e = (ErrorObj)obj;
            return Error.Equals(e.Error);
        }
    }
}
