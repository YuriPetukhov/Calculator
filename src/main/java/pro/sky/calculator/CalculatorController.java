package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String sayHello() {
        return calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public String calculateSum(@RequestParam(required = false) Integer num1,
                               @RequestParam(required = false) Integer num2) {
        return calculatorService.calculateSum(num1, num2);
    }

    @GetMapping("/minus")
    public String calculateSub(@RequestParam(required = false) Integer num1,
                               @RequestParam(required = false) Integer num2) {
        return calculatorService.calculateSub(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculateMult(@RequestParam(required = false) Integer num1,
                                @RequestParam(required = false) Integer num2){
        return calculatorService.calculateMult(num1, num2);
    }

    @GetMapping("/divide")
    public String calculateDiv(@RequestParam(required = false) Integer num1,
                               @RequestParam(required = false) Integer num2){
        return calculatorService.calculateDiv(num1, num2);
    }
}
