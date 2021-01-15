using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApplication1Try.Contexts;
using WebApplication1Try.Models;

namespace WebApplication1Try.Services
{
    public class TeacherService
    {
        private readonly ApplicationDbContext context;

        public TeacherService(ApplicationDbContext context)
        {
            this.context = context;
        }
        // Create
        public bool CreateTeacher(Teacher teacher)
        {
            if (teacher != null && teacher.Name != null && teacher.FavouriteScience != null)
            {
                context.Add(teacher);
                context.SaveChanges();
                return true;
            }
            return false;
        }
        // Read
        public Teacher GetTeacherById(long id)
        {
            return context.Teachers.FirstOrDefault(t => t.Id == id);
        }

        // Update
        public void UpdateTeacher(Teacher teacher)
        {
            var teacherToUpdate = context.Teachers.FirstOrDefault(t => t.Id == teacher.Id);
            teacherToUpdate.Name = teacher.Name;
            teacherToUpdate.Age = teacher.Age;
            teacherToUpdate.FavouriteScience = teacher.FavouriteScience;
            context.SaveChanges();
        }

        // Delete
        public void DeleteTeacher(Teacher teacher)
        {
            if (teacher != null)
            {
                context.Teachers.Remove(teacher);
                context.SaveChanges();
            }
        }

        // Find all teachers without students
        public List<Teacher> GetAllTeachersWithoutStudents()
        {
            return context.Teachers.ToList();
        }

        // Find all teachers with their students on list
        public List<Teacher> GetAllTeachersWithTheirStudents()
        {
            return context.Teachers.Include(t => t.Students).ToList();
        }
    }
}
