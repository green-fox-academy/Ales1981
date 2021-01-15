using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication1Try.Models
{
    public class Teacher
    {
        [Key]
        public long Id { get; set; }

        public string Name { get; set; }

        public int Age { get; set; }

        public string FavouriteScience { get; set; }

        public List<Student> Students { get; set; }

        public Teacher()
        {
        }

        public Teacher(string name, int age, string favouriteScience)
        {
            Name = name;
            Age = age;
            FavouriteScience = favouriteScience;
        }

        public Teacher(long id, string name, int age, string favouriteScience)
        {
            Id = id;
            Name = name;
            Age = age;
            FavouriteScience = favouriteScience;
        }
    }
}
