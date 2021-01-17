using Microsoft.AspNetCore.Mvc;
using RestApiWebApplication.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Controllers
{
    public class HomeController : Controller
    {
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

    }
}
