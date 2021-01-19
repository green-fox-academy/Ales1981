using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Guardians.Models
{
    public class RocketReceived
    {
        public string Received { get; set; }
        public int Amount { get; set; }
        public string ShipStatus { get; set; }
        public bool Ready { get; set; }

        public RocketReceived()
        {
        }

        public RocketReceived(string received, int amount, string shipStatus, bool ready)
        {
            Received = received;
            Amount = amount;
            ShipStatus = shipStatus;
            Ready = ready;
        }
    }
}
