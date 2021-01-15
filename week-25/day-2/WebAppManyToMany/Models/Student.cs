using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace WebAppManyToMany.Models
{
    public class Student
    {   
        [Key]
        public int StudentId { get; set; }
        public string Name { get; set; }

        public IList<StudentCourse> StudentCourses { get; set; }

        public Student()
        {
        }

        public Student(int studentId, string name)
        {
            StudentId = studentId;
            Name = name;
        }
    }
}
