using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Services
{
    interface IDoUntil
    {
        public int DoSumMethod(int until);
        public int DoFactorMethod(int until);
    }
}
