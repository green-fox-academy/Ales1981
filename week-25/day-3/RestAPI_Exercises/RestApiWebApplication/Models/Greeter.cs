using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RestApiWebApplication.Models
{
    public class Greeter
    {
        public string Name { get; set; }
        public string Title { get; set; }

        public string Welcome_message { get; set; }

        public Greeter()
        {
        }

        public Greeter(string name, string title)
        {
            this.Name = name;
            this.Title = title;
            this.Welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
    }
}
