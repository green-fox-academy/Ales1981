using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApplication1Try.Models;

namespace WebApplication1Try.Contexts
{
    public class ApplicationDbContext : DbContext
    {
        public virtual DbSet<Student> Students { get; set; }
        public virtual DbSet<Teacher> Teachers { get; set; }

        public ApplicationDbContext(DbContextOptions options) : base(options)
        {
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Teacher>()
                .HasMany(s => s.Students)
                .WithOne(t => t.Teacher);

            modelBuilder.Entity<Student>()
                .HasOne(t => t.Teacher)
                .WithMany(s => s.Students)
                .IsRequired();

            modelBuilder.Entity<Teacher>()
                .Ignore(t => t.FavouriteScience);

           // #region StudentSeed
           // modelBuilder.Entity<Student>()
           //     .HasData(
           //     new Student(1, "Ray", 15),
           //     new Student(2, "Lucy", 14),
           //     new Student(3, "George", 16)
           //     );
           //  #endregion
        }
    }
}
