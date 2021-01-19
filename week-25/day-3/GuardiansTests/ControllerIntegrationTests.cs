using Guardians;
using Guardians.Models;
using Microsoft.AspNetCore.Mvc.Testing;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;
using Xunit;

namespace GuardiansTests
{
    public class ControllerIntegrationTests : IClassFixture<WebApplicationFactory<Startup>>
    {
        private readonly WebApplicationFactory<Startup> factory;

        public ControllerIntegrationTests(WebApplicationFactory<Startup> factory)
        {
            this.factory = factory;
        }

        [Fact]
        public async Task GetMethod()
        {
            //Arrange


            //Act
            var response = await factory.CreateClient().GetAsync("/groot");
            var body = await response.Content.ReadAsStringAsync();

            var result = JsonSerializer.Deserialize<ErrorObj>(body, new JsonSerializerOptions { PropertyNameCaseInsensitive = true});

            //Assert
        }

        [Fact]
        public async Task PostMethod()
        {
            var response = await factory.CreateClient().PostAsync("/yondu", JsonContent.Create(new YonduData(10, 5)));
            var body = await response.Content.ReadAsStringAsync();

            var result = JsonSerializer.Deserialize<ErrorObj>(body, new JsonSerializerOptions { PropertyNameCaseInsensitive = true });
        }
    }
}
