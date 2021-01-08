using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2.GuessMyNumber
{
    public class GuessMyNumber
    {
        public void GuessMethod()
        {
            Console.WriteLine("The Guess machine.");
            Console.WriteLine("Guess the number from 0 to positive number of your choice! Write your choice now!");
            string userInput = Console.ReadLine();
            int numberRange;
            while (!int.TryParse(userInput, out numberRange))
            {
                Console.WriteLine("Please, write an integer number!");
                userInput = Console.ReadLine();
            }

            Random random = new Random();
            int numberToGuess = random.Next(numberRange);
            int lives = 5;
            int guess = 0;
            Console.WriteLine("I've the number between 0-" + numberRange + ".");
            Console.WriteLine("You have " + lives + " to find the number!");


            do
            {
                Console.WriteLine("What is your guess ?");
                guess = Int32.Parse(Console.ReadLine());

                if (guess > numberToGuess)
                {
                    lives--;
                    Console.WriteLine("No it is smaller.You have " + lives + " left!");

                }
                else if (guess < numberToGuess)
                {
                    lives--;
                    Console.WriteLine("No it is bigger.You have " + lives + " left!");
                }
            }
            while (guess != numberToGuess && lives > 0);
            Console.WriteLine();
            if (lives == 0)
            {
                Console.WriteLine("Sorry, you are out of lives!");
                Console.WriteLine("We were looking for number " + numberToGuess + ".");
            }
            else
            {
                Console.WriteLine("Correct! The number is : " + numberToGuess);
                Console.WriteLine("You have " + lives + " lives left!");
            }



        }
    }
}
