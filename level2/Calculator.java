package level2;

public class Calculator {

    private double num1, num2, result;
    private String operator;

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
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

    public void setResult(double value) {
        result = value;
    }

    public double getResult() {
        return this.result;
    }

    public double calculate() {

    }

}
