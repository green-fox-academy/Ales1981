using Microsoft.AspNetCore.Mvc;
using Guardians.Models;
using Guardians.Services;

namespace Guardians.Controllers
{
    [ApiController]
    public class GuardianController : ControllerBase
    {
        private readonly RocketService rocketService;

        public GuardianController(RocketService rocketService)
        {
            this.rocketService = rocketService;
        }

        [HttpGet("/groot")]
        public IActionResult Groot(string message)
        {
            return message != null ? Ok(new Groot(message)) : BadRequest(new ErrorObj("I am Groot!"));
        }

        [HttpGet("yondu")]
        public IActionResult YondosArrow(double? distance, double? time)
        {
            return distance != null && time != null
                ? Ok(new YondusArrow((double)distance, (double)time))
                : (IActionResult)BadRequest(new ErrorObj("Missing query parameter."));
        }

        [HttpPost("yondu")]
        public IActionResult YondosArrow(YonduData yonduData)
        {
            return yonduData.Distance != null && yonduData.Time != null
                ? Ok(new YondusArrow(yonduData.Distance, yonduData.Time))
                : (IActionResult)BadRequest(new ErrorObj("Missing query parameter."));
        }

        [HttpGet("rocket")]
        public IActionResult Rocket()
        {
            //Response.StatusCode = 418;
            return Ok(rocketService.GetRocket());
        }

        [HttpGet("rocket/fill")]
        public IActionResult RocketFill(string caliber, int? amount)
        {
            if (caliber != null && amount != null)
            {
                var result = rocketService.FillRocket(caliber, (int)amount);
                return Ok(new RocketReceived(caliber, (int)amount, result.Item1, result.Item2));
            }
            else
            {
                return BadRequest(new ErrorObj("Missing query parameter."));
            }
        }

        [HttpPost("rocket/fill")]
        public IActionResult RocketFill(RocketFillData rfd)
        {
            if (rfd.Caliber != null && rfd.Amount != null)
            {
                var result = rocketService.FillRocket(rfd.Caliber, (int)rfd.Amount);
                return Ok(new RocketReceived(rfd.Caliber, (int)rfd.Amount, result.Item1, result.Item2));
            }
            else
            {
                return BadRequest(new ErrorObj("Missing query parameter."));
            }
        }
    }
}
