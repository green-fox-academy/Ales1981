using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplicationOneToOne.Models
{
    public class Car
    {
        [Key]
        public long CarId { get; set; }
        public string Brand { get; set; }
        public float FuelConsumption { get; set; }
        public int Weight { get; set; }
        public int TopSpeed { get; set; }
        public string Type { get; set; }

        public Engine Engine { get; set; }

        public Car()
        {
        }

        public Car(long carId, string brand, float fuelConsumption, int weight, int topSpeed, string type)
        {
            CarId = carId;
            Brand = brand;
            FuelConsumption = fuelConsumption;
            Weight = weight;
            TopSpeed = topSpeed;
            Type = type;
        }
    }
}
