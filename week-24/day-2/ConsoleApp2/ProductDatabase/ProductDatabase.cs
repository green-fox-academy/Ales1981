using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApp2.ProductDatabase
{
    public class Solution
    {

        //static void Main(string[] args)
        public void MethodProductDb()
        {
            var map = new Dictionary<string, int>();

            map.Add("Eggs", 200);
            map.Add("Milk", 200);
            map.Add("Fish", 400);
            map.Add("Apples", 200);
            map.Add("Bread", 50);
            map.Add("chicken", 550);

            // How much is the fish?
            Console.WriteLine(map["Fish"]);
            Console.WriteLine("How much is the fish? " + map["Fish"]);
            int valueOfTheKey;
            map.TryGetValue("Fish", out valueOfTheKey);
            Console.WriteLine("Value of the key Fish is : " + map.TryGetValue("Fish", out valueOfTheKey));


            // What is the most expensive product?
            var keyOfMaxValue = map.Aggregate((l, r) => l.Value > r.Value ? l : r).Key;
            Console.WriteLine("Max value has :" + keyOfMaxValue);

            // What is the average price?

            var averageValue = map.Average(t => t.Value);
            Console.WriteLine("Average value is " + averageValue);

            // How many products' price is below 300?

            var productsUnder300 = map.Where(v => v.Value < 300).Count();
            Console.WriteLine("How many products have value lower then 300 : " + productsUnder300);

            // Is there anything we can buy for exactly 125?
            var productFor125 = map.FirstOrDefault(v => v.Value == 125).Key;
            if (productFor125 != null)
            {
                Console.WriteLine("For 125 you can have : " + productFor125);
            }
            else
            {
                Console.WriteLine("There is nothing for 125...");
            }

            // What is the cheapest product?
            var keyOfMinValue = map.Aggregate((l, r) => l.Value < r.Value ? l : r).Key;
            Console.WriteLine("Min value has :" + keyOfMinValue);

        }
    }
}
