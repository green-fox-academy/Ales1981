using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApplicationOneToOne.Models;

namespace WebApplicationOneToOne.Services
{
    public class EngineService
    {
        private readonly ApplicationDbContext context;

        public EngineService(ApplicationDbContext context)
        {
            this.context = context;
        }

        // Create
        public bool CreateEngine(Engine engine)
        {
            if (engine != null)
            {
                context.Add(engine);
                context.SaveChanges();
                return true;
            }
            return false;
        }
        // Read
        public Engine GetEngineById(long id)
        {
            return context.Engines.FirstOrDefault(e => e.EngineId == id);
        }

        // Update
        public void UpdateEngine(Engine engine)
        {
            var engineToUpdate = context.Engines.FirstOrDefault(e => e.EngineId == engine.EngineId);
            engineToUpdate.IsElectric = engine.IsElectric;
            engineToUpdate.Valves = engine.Valves;
            engineToUpdate.Weight = engine.Weight;
            context.SaveChanges();
        }
        // Delete
        public void DeleteEngine(Engine engine)
        {
            if (engine != null)
            {
                context.Engines.Remove(engine);
            }
        }
    }
}
