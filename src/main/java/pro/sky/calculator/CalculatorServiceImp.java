package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImp implements CalculatorService{

    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculateSum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String calculateSub(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @Override

    public String calculateMult(int num1, int num2){
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override

    public String calculateDiv(int num1, int num2){
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
