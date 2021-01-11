using System;

namespace Testing
{
    class Program
    {
        static void Main(string[] args)
        {
            Testing.Anagram.Anagram anagram = new Testing.Anagram.Anagram();
            Console.WriteLine(anagram.IsAnagram(anagram.UserWrites(), anagram.UserWrites()) ? "anagrams" : "are not anagrams");
        }
    }
}
