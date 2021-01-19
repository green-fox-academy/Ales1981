using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Models
{
    public class Rocket
    {
        private static int maxAmount = 12500;
        public int Caliber25 { get; set; }
        public int Caliber30 { get; set; }
        public int Caliber50 { get; set; }
        public string ShipStatus
        {
            get
            {
                return GetStatusSwitch();
            }
        }
        public bool Ready
        {
            get
            {
                return (Caliber25 + Caliber30 + Caliber50) == maxAmount;
            }
        }

        public Rocket()
        {
        }

        public Rocket(int caliber25, int caliber30, int caliber50)
        {
            Caliber25 = caliber25;
            Caliber30 = caliber30;
            Caliber50 = caliber50;
        }

        public string GetStatus()
        {
            if ((Caliber25 + Caliber30 + Caliber50) == 0)
            {
                return "empty";
            }
            else if ((Caliber25 + Caliber30 + Caliber50) < maxAmount)
            {
                return ((Caliber25 + Caliber30 + Caliber50) * 100) / maxAmount + "%";
            }
            else if ((Caliber25 + Caliber30 + Caliber50) == maxAmount)
            {
                return "full";
            }
            else
            {
                return "overloaded";
            }
        }

        public string GetStatusSwitch()
        {
            var level = (double)(Caliber25 + Caliber30 + Caliber50) / maxAmount;
            switch (level)
            {
                case 0:
                    return "empty";
                case < 1:
                    return Math.Round(level * 100,1) + "%";
                case 1:
                    return "full";
                default:
                    return "overloaded";
            }
        }

        public override bool Equals(object obj)
        {
            var r = (Rocket)obj;
            return this.Caliber25 == r.Caliber25 && this.Caliber30 == r.Caliber30 && this.Caliber50 == r.Caliber50;
        }
    }
}
