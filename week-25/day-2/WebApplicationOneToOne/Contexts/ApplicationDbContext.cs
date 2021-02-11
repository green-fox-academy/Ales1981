using Microsoft.EntityFrameworkCore;
using WebApplicationOneToOne.Models;

namespace WebApplicationOneToOne
{
    public class ApplicationDbContext : DbContext
    {
        public virtual DbSet<Car> Cars { get; set; }
        public virtual DbSet<Engine> Engines { get; set; }

        public ApplicationDbContext(DbContextOptions options) : base(options)
        {
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Car>()
                        .HasOne(c => c.Engine)
                        .WithOne(e => e.Car)
                        .HasForeignKey<Engine>(e => e.CarId);
        }
    }
}