using System;
using System.Collections.Generic;
using System.Text;

namespace Testing.Anagram
{
    public class Anagram
    {
        public string UserWrites()
        {
            Console.WriteLine("Write a word: ");
            string userInput = Console.ReadLine();
            return userInput.Replace(" ", "").Trim();

        }

        public char[] ConvertStringToChar(string str)
        {
            char[] ch = new char[str.Length];
            ch = str.ToLower().ToCharArray();
            return ch;
        }

        public bool IsAnagram(string str1, string str2)
        {
            char[] char1 = ConvertStringToChar(str1);
            char[] char2 = ConvertStringToChar(str2);
            if (char1.Length != char2.Length)
            {
                return false;
            }
            Array.Sort(char1);
            Array.Sort(char2);
            for (int i = 0; i < char1.Length; i++)
            {
                if (char1[i] != char2[i])
                    return false;
            }
            return true;

        }
    }
}
