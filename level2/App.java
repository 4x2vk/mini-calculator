package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("                              ");
            System.out.println("==============================");
            System.out.println("✨     SIMPLE CALCULATOR    ✨");
            System.out.println("==============================");
            System.out.println("       'exit' 입력하면 종료     ");
            System.out.println("                              ");

            System.out.print("👉 1번째 숫자 입력: ");
            String firstInput = input.nextLine();
            if(firstInput.equals("exit")) break;

            System.out.print("👉 2번째 숫자 입력: ");
            String secondInput = input.nextLine();
            if(secondInput.equals("exit")) break;

            double num1, num2;

            try {
                num1 = Double.parseDouble(firstInput);
                num2 = Double.parseDouble(secondInput);
                if (num1 < 0 || num2 < 0) {
                    System.out.println("\uD83D\uDEAB 양수만 입력해주세요!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("\uD83D\uDEAB 숫자만 입력해주세요!");
                continue;
            }

            System.out.print("사용 가능한 연산자 [+  -  *  /]: ");
            String operator = input.nextLine();
            if(operator.equals("exit")) break;
            char op = operator.charAt(0);

            double result = calculator.calculate(num1, num2 , op);
            System.out.println("result: " + result);

        }
    }
}