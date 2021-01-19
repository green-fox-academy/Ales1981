using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Models
{
    public class YonduData
    {
        public double? Distance { get; set; }
        public double? Time { get; set; }

        public YonduData()
        {
        }

        public YonduData(double distance, double time)
        {
            Distance = distance;
            Time = time;
        }
    }
}
