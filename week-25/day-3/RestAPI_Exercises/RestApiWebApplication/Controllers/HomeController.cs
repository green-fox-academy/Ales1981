using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using RestApiWebApplication.Models;
using RestApiWebApplication.Services;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Controllers
{
    public class HomeController : Controller
    {
        private readonly DoUntilService doUntilService;

        private readonly ArrayHandlerService arrayHandlerService;

        public HomeController(DoUntilService doUntilService, ArrayHandlerService arrayHandlerService)
        {
            this.doUntilService = doUntilService;
            this.arrayHandlerService = arrayHandlerService;
        }

        [Route("")]
        public IActionResult Index()
        {
            return File("index.html", "text/html");
        }
        [HttpGet("/doubling")]
        public IActionResult Doubling(int input)
        {
            if (input.Equals(0)) // why it is not working with 'input.Equals(null);' ???
            {
                return new JsonResult(new Error("Please provide an input!"));
            }
            Doubling doubling = new Doubling(input);
            return new JsonResult(doubling);
        }
        [HttpGet("/greeter")]
        public IActionResult Greeter(string name, string title)
        {
            if (string.IsNullOrEmpty(name) && string.IsNullOrEmpty(title))
            {
                return BadRequest(new Error("Please provide a name and a title!"));
            }
            if (string.IsNullOrEmpty(name))
            {
                return BadRequest(new Error("Please provide a name!"));
                //return BadRequest(new JsonResult(new Error("Please provide a name!")));
            }
            if (string.IsNullOrEmpty(title))
            {
                return BadRequest(new Error("Please provide a title!"));
            }
            return new JsonResult(new Greeter(name, title));
        }
        [HttpGet("/appenda/{appendable}")]
        public IActionResult AppendLetterA(string appendable)
        {
            if (string.IsNullOrEmpty(appendable))
            {
                return NotFound();
            }
            Append append = new Append(appendable);
            return new JsonResult(append);
        }
        [HttpPost("/dountil/{someaction}")]
        public IActionResult DoSomeMathOperation(string someaction)
        {
            JObject json1 = JObject.Parse("{\"dountil7\":\"7\"}"); //input num is hardcoded so error scenario will never happen.
            var numToSum = (int)json1["dountil7"];
            JObject json2 = JObject.Parse("{\"dountil4\":\"4\"}");
            var numToFactor = (int)json2["dountil4"];
            if (!numToSum.Equals(null) || !numToFactor.Equals(null))
            {
                if (someaction.Equals("sum"))
                {
                    return new JsonResult(new DoUntil(numToSum, doUntilService.DoSumMethod(numToSum)));
                }

                if (someaction.Equals("factor"))
                {
                    return new JsonResult(new DoUntil(numToFactor, doUntilService.DoFactorMethod(numToFactor)));
                }
                return new JsonResult(new Error("Please, provide operation 'sum' or 'factor'"));
            }
            return new JsonResult(new Error("Please provide a number!"));
        }
        [HttpPost("/arrays")] // does not work yet ... 
        public IActionResult DoWithArray()
        {
            string json = @"{'what':'sum','numbers': [1,2,5,10] }";
            JObject json1 = JObject.Parse("{\"what\": \"sum\", \"numbers\": \"[1,2,5,10]\"}");
            JObject json2 = JObject.Parse("{\"what\": \"multiply\", \"numbers\": \"[1,2,5,10]\"}");
            JObject json3 = JObject.Parse("{\"what\": \"double\", \"numbers\": \"[1,2,5,10]\"}");
            string whatToDo = (string)json1["what"];
            ArrayHandlerJsonObject arrayHandlerJsonObject = JsonConvert.DeserializeObject<ArrayHandlerJsonObject>(json);
            int[] arr = (int[])arrayHandlerJsonObject.Numbers;
            if (!string.IsNullOrEmpty(whatToDo) || arr.Length >= 0)
            {
                if (whatToDo.Equals("sum"))
                {
                    return new JsonResult(new ArrayHandler(arrayHandlerService.DoSum(arr)));
                }
                else if (whatToDo.Equals("multiply"))
                {
                    return new JsonResult(new ArrayHandler(arrayHandlerService.DoMultiply(arr)));
                }
                else if (whatToDo.Equals("double"))
                {

                }
                else
                {
                    return new JsonResult(new Error("Unknown operation."));
                }
            }
            return new JsonResult(new Error("Please provide what to do with the numbers!"));
        }

    }
}
