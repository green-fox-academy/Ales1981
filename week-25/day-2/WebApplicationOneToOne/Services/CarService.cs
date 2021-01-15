using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApplicationOneToOne.Models;

namespace WebApplicationOneToOne.Services
{
    public class CarService
    {
        private readonly ApplicationDbContext context;

        public CarService(ApplicationDbContext context)
        {
            this.context = context;
        }
        // Create
        public bool CreateCar(Car car)
        {
            if (car != null && car.Brand != null && car.Engine != null)
            {
                context.Add(car);
                context.SaveChanges();
                return true;
            }
            return false;
        }
        // Read
        public Car GetCarById(long id)
        {
            return context.Cars.FirstOrDefault(c => c.CarId == id);
        }
        // Update
        public void UpdateCar(Car car)
        {
            var carToUpdate = context.Cars.FirstOrDefault(c => c.CarId == car.CarId);
            carToUpdate.Brand = car.Brand;
            carToUpdate.TopSpeed = car.TopSpeed;
            carToUpdate.FuelConsumption = car.FuelConsumption;
            carToUpdate.Type = car.Type;
            context.SaveChanges();
        }

        // Delete
        public void DeleteCar(Car car)
        {
            if (car != null)
            {
                context.Cars.Remove(car);
                //context.Engines.Remove(car.Engine);
                context.SaveChanges();
            }
        }
        // Get all cars
        public List<Car> GetAllCars()
        {
            return context.Cars.ToList();
        }
    }
}
