using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApplication1Try.Contexts;
using WebApplication1Try.Models;

namespace WebApplication1Try.Services
{
    public class StudentService
    {
        private readonly ApplicationDbContext context;

        public StudentService(ApplicationDbContext context)
        {
            this.context = context;
        }
        // Create
        public bool CreateStudent(Student student)
        {
            if (student != null && student.Name != null)
            {
                context.Add(student);
                context.SaveChanges();
                return true;
            }
            return false;
        }
        // Read
        public Student GetStudentByName(string name)
        {
            return context.Students.FirstOrDefault(s => s.Name == name);
        }

        // Update
        public void UpdateStudent(Student student)
        {
            var studentToUpdate = context.Students.FirstOrDefault(s => s.Id == student.Id);
            studentToUpdate.Name = student.Name;
            studentToUpdate.Age = student.Age;
            context.SaveChanges();
        }
        // Delete
        public void DeleteStudent(Student student)
        {
            if (student != null)
            {
                context.Students.Remove(student);
                context.SaveChanges();
            }
        }
        // Get all students only
        public List<Student> GetAllStudents()
        {
            return context.Students.ToList();
        }
        // Get all students by teacher's name
        public List<Student> GetAllStudentsTeachedBy(Teacher teacher)
        {
            return context.Students.Where(s => s.Teacher.Name.Equals(teacher.Name)).ToList();
        }
    }
}
