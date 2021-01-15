using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication1Try.Models
{
    public class Student
    {
        [Key]
        public long Id { get; set; }

        public string Name { get; set; }

        public int Age { get; set; }

        public Teacher Teacher { get; set; }

        public Student()
        {
        }

        public Student(string name, int age)
        {
            Name = name;
            Age = age;
        }

        public Student(long id, string name, int age)
        {
            Id = id;
            Name = name;
            Age = age;
        }
    }
}
