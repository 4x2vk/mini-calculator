package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>();

    private double num1, num2;
    private char operator;

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return this.operator;
    }

    public void setNum1(double value) {
        this.num1 = value;
    }

    public void setNum2(double value) {
        this.num2 = value;
    }

    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public List<Double> getResults() {
        return this.results;
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    public double calculate() {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
            case ':':
                if (num2 == 0) throw new ArithmeticException("\uD83D\uDEAB 0으로 나눌 수 없습니다!");
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("\uD83D\uDEAB 올바르지 않은 연산자입니다. 다시 입력해주세요!");
        }
        results.add(result);
        return result;
    }
}