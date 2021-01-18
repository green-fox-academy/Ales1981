using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Services
{
    interface IArrayHandlerService
    {
        public int DoSum(int[] arr);

        public int DoMultiply(int[] arr);

        public int[] DoDouble(int[] arr);
    }
}
