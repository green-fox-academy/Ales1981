using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class ArrayHandlerJsonObject
    {
        public string What { get; set; }
        public IList<int> Numbers { get; set; }
    }
}
