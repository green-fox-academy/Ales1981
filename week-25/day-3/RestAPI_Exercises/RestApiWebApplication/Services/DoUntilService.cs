using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Services
{
    public class DoUntilService : IDoUntil
    {
        public int DoFactorMethod(int until)
        {
            int factorResult = 1;
            for (int i = 1; i <= until; i++)
            {
                factorResult *= i;
            }
            return factorResult;
        }

        public int DoSumMethod(int until)
        {
            int sumResult = 0;
            for (int i = until; i > 0; i--)
            {
                sumResult += i;
            }
            return sumResult;
        }
    }
}
