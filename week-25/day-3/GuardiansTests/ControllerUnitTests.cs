using Guardians.Controllers;
using Guardians.Models;
using Guardians.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using System;
using Xunit;

namespace GuardiansTests
{
    public class ControllerUnitTests
    {
        [Fact]
        // Method name: <tested method name>_<input type>_<return type>
        // Example: RocketFill_ValidInput_ReturnsOk()
        public void Rocket_ReturnsOk()
        {
            // Arrange
            var rocketServiceMock = new Mock<RocketService>();
            rocketServiceMock.Setup(r => r.GetRocket()).Returns(GetFullRocket());
            var controller = new GuardianController(rocketServiceMock.Object);

            // Act
            var result = (ObjectResult)controller.Rocket();

            // Assert
            Assert.Equal(200, result.StatusCode);
           
        }

        public Rocket GetFullRocket()
        {
            return new Rocket(2500, 5000, 5000);
        }

        public Rocket GetEmptyRocket()
        {
            return new Rocket();
        }

        [Fact]
        public void Groot_ReturnsStatusOK()
        {
            // Arrange
            var rocketServiceMock = new Mock<RocketService>();
            var controller = new GuardianController(rocketServiceMock.Object);
            // Act
            var result = (ObjectResult)controller.Groot("message");
            // Assert
            Assert.Equal(200, result.StatusCode);
        }
        [Fact]
        public void Groot_ReturnsErrorMessage()
        {
            //Arrange
            var expectedError = new ErrorObj("I am Groot!");
            string someMessage = null;
            var rocketServiceMock = new Mock<RocketService>();
            var controller = new GuardianController(rocketServiceMock.Object);
            //Act
            var result = (ObjectResult)controller.Groot(someMessage);
            //Assert
            Assert.Equal<ErrorObj>(expectedError, (ErrorObj)result.Value);
            Assert.Equal(400, result.StatusCode);
            // Asser.Equal(expected, actual)
        }

        [Fact]
        public void Youndu_GetEndpointWithAllParametersReturnsStatusOK()
        {
            //Arrange
            var rocketServiceMock = new Mock<RocketService>();
            var controller = new GuardianController(rocketServiceMock.Object);

            //Act
            var result = (ObjectResult)controller.YondosArrow(100, 10);
            //Assert
            Assert.Equal(200, result.StatusCode);

        }
        [Fact]
        public void Youndu_GetEndpointWithNoCompleteParametersReturnsStatusNotOk()
        {
            //Arrange
            var expectedError = new ErrorObj("Missing query parameter.");
            var rocketServiceMock = new Mock<RocketService>();
            var controller = new GuardianController(rocketServiceMock.Object);
            double? distance = null, time = null;

            //Act
            var result = (ObjectResult)controller.YondosArrow(distance, time);

            // Assert
            Assert.Equal<ErrorObj>(expectedError, (ErrorObj)result.Value);
            Assert.Equal(400, result.StatusCode);
        }
    }
}
