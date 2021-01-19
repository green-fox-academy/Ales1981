using Guardians.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Services
{
    public class RocketService
    {
        private Rocket rocket;

        public RocketService()
        {
            rocket = new Rocket();
        }

        public virtual Rocket GetRocket()
        {
            return rocket;
        }

        public (string, bool) FillRocket(string caliber, int amount)
        {
            double.TryParse(caliber, out double result);
            switch (result)
            {
                case 0.25:
                    rocket.Caliber25 += amount;
                    break;
                case 0.3:
                    rocket.Caliber30 += amount;
                    break;
                case 0.5:
                    rocket.Caliber50 += amount;
                    break;
                default:
                    break;
            }

            return (rocket.ShipStatus, rocket.Ready);
        }
    }
}
