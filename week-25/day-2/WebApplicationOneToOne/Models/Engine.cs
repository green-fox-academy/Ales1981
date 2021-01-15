using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplicationOneToOne.Models
{
    public class Engine
    {
        [Key]
        public long EngineId { get; set; }
        public int Weight { get; set; }
        public int Valves { get; set; }
        public bool IsElectric { get; set; }

        public long CarEngineId { get; set; }
        public Car Car { get; set; }

        public Engine()
        {
        }

        public Engine(long engineId, int weight, int valves, bool isElectric)
        {
            EngineId = engineId;
            Weight = weight;
            Valves = valves;
            IsElectric = isElectric;
        }
    }
}
