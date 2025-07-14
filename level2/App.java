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
            System.out.println("      'delete' 입력하면 종료     ");
            System.out.println("                              ");

            System.out.print("👉 1번째 숫자 입력: ");
            String firstInput = input.nextLine();
            if(firstInput.equals("exit")) break;
            if (firstInput.equals("delete")) {
                calculator.removeFirstResult();
                System.out.println("🗑️ 첫 결과가 삭제되었습니다!");
                continue;
            }

            System.out.print("👉 2번째 숫자 입력: ");
            String secondInput = input.nextLine();
            if(secondInput.equals("exit")) break;
            if (secondInput.equals("delete")) {
                calculator.removeFirstResult();
                System.out.println("🗑️ 첫 결과가 삭제되었습니다!");
                continue;
            }

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

            System.out.print("사용 가능한 연산자 [+  -  *  / ]: ");
            String operator = input.nextLine();
            if(operator.equals("exit")) break;
            if (operator.equals("delete")) {
                calculator.removeFirstResult();
                System.out.println("🗑️ 첫 결과가 삭제되었습니다!");
                continue;
            }
            char op = operator.charAt(0);

            calculator.setNum1(num1);
            calculator.setNum2(num2);
            calculator.setOperator(op);

            try {
                double result = calculator.calculate();
                System.out.println("==============================");
                System.out.println("🧾 결과: " + calculator.getNum1() + " " + calculator.getOperator() + " " + calculator.getNum2() + " = " + result);
                System.out.println("==============================");
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("👋 계산기를 종료합니다. 감사합니다!");
        input.close();
    }
}
