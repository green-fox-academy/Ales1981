using System;
using AnagramXUnitTestProject;
using Xunit;

namespace AnagramXUnitTestProject
{
    public class UnitTest1
    {
        [Fact]
        public void TestAnagramResultTrue()
        {
            // Arrange 
            var anagramFunc = new Testing.Anagram.Anagram();
            // Act
            bool outPut = anagramFunc.IsAnagram("west", "stew");
            // Assert
            Assert.True(outPut);
        }

        [Fact]
        public void TestAnagramresultFalse()
        {
            //Arrange
            var anagramFunc = new Testing.Anagram.Anagram();

            // Act
            bool outPut = anagramFunc.IsAnagram("expect", "respect");

            // Assert
            Assert.False(outPut);
        }

        [Theory]
        [InlineData("west", "stew")]
        [InlineData("Listen", "Silent")]
        public void TestAnagramMultipleResultsTrue(string str1, string str2)
        {
            var anagramFunc = new Testing.Anagram.Anagram();
            Assert.True(anagramFunc.IsAnagram(str1, str2));
        }

        [Theory]
        [InlineData("", "nothing")]
        [InlineData("expect", "respect")]
        public void TestAnagramMultipleResultsFalse(string str1, string str2)
        {
            var anagramFunc = new Testing.Anagram.Anagram();
            Assert.False(anagramFunc.IsAnagram(str1, str2));
        }

    }
}
