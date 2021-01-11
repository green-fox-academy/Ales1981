using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;
using System.Text;

namespace LinqExcercises
{
    class Program
    {
        static void Main(string[] args)
        {
            // Exercise 1
            // Write a LINQ Expression to get the even numbers from the following array:
            int[] n1 = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            var evenNumbers = n1.Where(num => num % 2 == 0).ToList();

            // excercise 2
            // Write a LINQ Expression to get the average value of the odd numbers from the following array:
            int[] n2 = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            var averageValue = n2.Where(num => num % 2 != 0).Average();

            // exercise 3
            // Write a LINQ Expression to get the squared value of the positive numbers from the following array:
            int[] n3 = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            var positiveValuesSquared = n3.Where(num => num > 0).Select(num => num * num).ToList();

            // exercise 4
            // Write a LINQ Expression to find which number squared value is more then 20 from the following array:
            int[] n4 = new[] { 3, 9, 2, 8, 6, 5 };
            var squaredValue = n4.Where(num => (num * num) > 20).ToList();

            // exercise 5
            // Write a LINQ Expression to find the frequency of numbers in the following array:
            int[] n5 = new int[] { 5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2 };
            var frequencyOfNum = n5.GroupBy(num => num).ToDictionary(num => num.Key, num => num.Count());

            // exercise 6
            // Write a LINQ Expression to find the frequency of characters in a given string.
            string givenString = "Ababababc";
            var frequency = givenString.GroupBy(l => l).ToDictionary(g => g.Key, g => g.Count());

            // exercise 7
            // Write a LINQ Expression to find the strings which starts with A and ends with I in the following array:
            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };
            var cities7 = cities.Where(c => cities.Any(r => c.StartsWith('A') && c.EndsWith('I'))).ToList();

            // exercise 8
            // Write a LINQ Expression to find the uppercase characters in a string.
            string stringWithUpperCase = "aBc";
            var result = String.Concat(stringWithUpperCase.Where(c => c >= 'A' && c <= 'Z'));

            // exercise 9
            // Write a LINQ Expression to convert a char array to a string.

            // program that converts char array

            // Create 3-character array.
            char[] arr = new char[3];
            arr[0] = 'c';
            arr[1] = 'a';
            arr[2] = 't';
            // Create string from array.
            string resultString = new string(arr);
            Console.WriteLine($"STRING : {resultString}");

            // Create 3-character array.
            char[] arr1 = { 'c', 'a', 't' };
            // Loop over the array with foreach, and append to a StringBuilder.
            StringBuilder builder = new StringBuilder();
            foreach (char c in arr1)
            {
                builder.Append(c);
            }
            string resultString1 = builder.ToString();
            Console.WriteLine($"STRING BUILDER : {resultString1}");


            // exercise 10
            // Create a Fox class with 3 properties: name, type and color.
            // Fill a list with at least 5 foxes, it's up to you how you name/create them.
            // Write a LINQ Expression to find the foxes with green color.
            // Write a LINQ Expression to find the foxes with green color and pallida type.

            List<LinqExcercises.Fox.Fox> foxes = new List<LinqExcercises.Fox.Fox>();
            foxes.Add(new LinqExcercises.Fox.Fox("Mick", "nice", "white"));
            foxes.Add(new LinqExcercises.Fox.Fox("Lucky", "angry", "grey"));
            foxes.Add(new LinqExcercises.Fox.Fox("Joe", "pallida", "brown"));
            foxes.Add(new LinqExcercises.Fox.Fox("Smithy", "leon like", "black"));
            foxes.Add(new LinqExcercises.Fox.Fox("Copy", "nice", "green"));

            var greenFoxes = foxes.Where(f => f.Color.Equals("green")).Select(l => l.Name).ToList();
            var greenAndPallidaFoxes2 = foxes.FindAll(f => (f.Color == "green") || (f.Type == "pallida")).ToList();


            // exercise 12

            /*
             var fileName = "swcharacters.txt";
            var path = $@"C:\Users\Aleš\greenfox\Ales1981\week-24\day-3\LinqExcercises\{fileName}";
            var splitters = new char[] { '.', ',', ';', '!', '?', ' ', '\r', '\n' };
            var splitters = new List<string> 
            var words = File.ReadAllText(path)
                .Split(splitters, StringSplitOptions.RemoveEmptyEntries)
                .ToList();
             */
        }
    }
}