package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculateSum(Integer num1, Integer num2) {
        if (checkParams(num1, num2)) {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
        return "Введите все значения";
    }

    @Override
    public String calculateSub(Integer num1, Integer num2) {
        if (checkParams(num1, num2)) {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
        return "Введите все значения";
    }

    @Override
    public String calculateMult(Integer num1, Integer num2) {
        if (checkParams(num1, num2)) {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
        return "Введите все значения";
    }

    @Override
    public String calculateDiv(Integer num1, Integer num2) {
        if (checkParams(num1, num2)) {
            if (num2 == 0) {
                return "Деление на ноль невозможно";
            }
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
        return "Введите все значения";
    }

    private boolean checkParams(Integer num1, Integer num2) {
        return num1 != null && num2 != null;
    }
}
