using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Services
{
    public class ArrayHandlerService : IArrayHandlerService
    {
        public int[] DoDouble(int[] arr)
        {
            int[] result = new int[arr.Length];
            for (int i = 0; i < arr.Length; i++)
            {
                result[i] = arr[i] * 2;
            }
            return result;
        }

        public int DoMultiply(int[] arr)
        {
            int result = 1;
            foreach (int element in arr)
            {
                result *= element;
            }
            return result;
        }

        public int DoSum(int[] arr)
        {
            int result = 0;
            foreach (int element in arr)
            {
                result += element;
            }
            return result;
        }
    }
}
