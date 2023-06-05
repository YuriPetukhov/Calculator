package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorServiceImp;
    public CalculatorController(CalculatorService calculatorServiceImp){
        this.calculatorServiceImp = calculatorServiceImp;
    }

    @GetMapping(path = "/calculator")
    public String sayHello() {
        return calculatorServiceImp.sayHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculateSum(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return calculatorServiceImp.calculateSum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculateSub(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2) {
        return calculatorServiceImp.calculateSub(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")

    public String calculateMult(@RequestParam("num1") int num1,
                                @RequestParam("num2") int num2){
        return calculatorServiceImp.calculateMult(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")

    public String calculateDiv(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2){
        return calculatorServiceImp.calculateDiv(num1, num2);
    }
}
