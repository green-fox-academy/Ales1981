using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Models
{
    public class YondusArrow
    {
        public double Distance { get; set; }
        public double Time { get; set; }
        public double? Speed
        {
            get
            {
                return Time > 0 ? Distance / Time : (double?)null;
            }
        }

        public YondusArrow()
        {
        }

        public YondusArrow(double distance, double time)
        {
            Distance = distance;
            Time = time;
        }

        public YondusArrow(double? distance, double? time)
        {
            Distance = (double)distance;
            Time = (double)time;
        }
    }
}
