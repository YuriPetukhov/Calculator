package pro.sky.calculator;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CalculatorServiceImp implements CalculatorService{

    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculateSum(Integer num1, Integer num2) {
            return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String calculateSub(Integer num1, Integer num2) {
            return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @Override

    public String calculateMult(Integer num1, Integer num2){
            return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override

    public String calculateDiv(Integer num1, Integer num2){
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
        return "Введите другие значения";
    }
}
