using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2.ArmstrongNumber
{
    public class ArmstrongNumber
    {
        public void ArmstrongNumberCheckerMethod()
        {
            Console.WriteLine("Write a number:");
            string userInput = Console.ReadLine();
            int numberToCheck;
            int numberToBeCubed;
            int sum = 0;
            int temp;
            while (!int.TryParse(userInput, out numberToCheck))
            {
                Console.WriteLine("Please, write an integer number!");
                userInput = Console.ReadLine();
            }

            temp = numberToCheck;
            while (numberToCheck > 0)
            {
                numberToBeCubed = numberToCheck % 10;
                sum = sum + (numberToBeCubed * numberToBeCubed * numberToBeCubed);
                numberToCheck = numberToCheck / 10;
            }
            if (temp == sum)
            {
                Console.WriteLine("It is Armstrong number.");
            }
            else
            {
                Console.WriteLine("It is not Armstrong number.");
            }


        }
    }
}
