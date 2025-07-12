package level1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
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

            double result = 0.0;
            boolean isOperator = true;

            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                case ':':
                    if (num2 == 0) {
                        System.out.println("==============================");
                        System.out.println("\uD83D\uDEAB 0으로 나눌 수 없습니다!");
                        System.out.println("==============================");
                        isOperator = false;
                    } else {
                        result = num1 / num2;
                    } break;
                default:
                    System.out.println("==============================");
                    System.out.println("\uD83D\uDEAB 올바르지 않은 연산자입니다. 다시 입력해주세요!");
                    System.out.println("==============================");
                    isOperator = false;
            }
            if (isOperator) {
                System.out.println("==============================");
                System.out.println("🧾 결과: " + num1 + " " + operator + " " + num2 + " = " + result);
                System.out.println("==============================");

            }
        }
        System.out.println("==============================");
        System.out.println("👋 계산기를 종료합니다. 감사합니다!");
        input.close();
    }
}
