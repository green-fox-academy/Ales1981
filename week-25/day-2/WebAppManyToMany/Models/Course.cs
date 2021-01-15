using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace WebAppManyToMany.Models
{
    public class Course
    {
        [Key]
        public int CourseId { get; set; }
        public string CourseName { get; set; }
        public string Description { get; set; }

        public IList<StudentCourse> StudentCourses { get; set; }

        public Course()
        {
        }

        public Course(int courseId, string courseName, string description)
        {
            CourseId = courseId;
            CourseName = courseName;
            Description = description;
        }
    }
}
