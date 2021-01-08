using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            // just a test code...
            //   ConsoleApp2.ProductDatabase.Test test = new ConsoleApp2.ProductDatabase.Test();
            //   Console.WriteLine(test.count(3, 3));

            // solution for Product Database excercise
            //   ConsoleApp2.ProductDatabase.Solution solution = new ConsoleApp2.ProductDatabase.Solution();
            //   solution.MethodProductDb();

            // solution for Guess My Number excercise
            //   ConsoleApp2.GuessMyNumber.GuessMyNumber myNumber = new GuessMyNumber.GuessMyNumber();
            //   myNumber.GuessMethod();

            // solution for Armstrong number excercise
            //      ConsoleApp2.ArmstrongNumber.ArmstrongNumber number = new ArmstrongNumber.ArmstrongNumber();
            //      number.ArmstrongNumberCheckerMethod();

            ConsoleApp2.Zoo.Animal bird = new ConsoleApp2.Zoo.Bird(1,3,"Lucky");
            bird.Greet();
            bird.WantChild();
            ConsoleApp2.Zoo.Mammal mammal = new ConsoleApp2.Zoo.Mammal(5, 2, "green");
            ConsoleApp2.Zoo.Mammal mammal1 = new ConsoleApp2.Zoo.Mammal("John", "M", "orange", 22);
            ConsoleApp2.Zoo.Bird bird1 = new Zoo.Bird(1, 1, "sparow");
            mammal.Greet();
            mammal.WantChild();
            bird1.Greet();
            bird1.WantChild();
            Console.WriteLine("Who want a baby?");
            Console.WriteLine(bird1.Name + ", " +bird1.WantChild());
            Console.WriteLine(mammal.Name + ", " + mammal.WantChild());
            Console.WriteLine(bird.Name + ", " + bird.WantChild());

        }
            
    }
}
