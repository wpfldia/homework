import java.util.Scanner;

public class Calculator {
    private double result;

    public Calculator(double initialValue) {
        this.result = initialValue;
    }

    public void add(double value) {
        result += value;
        System.out.println("결과: " + result);
    }

    public void subtract(double value) {
        result -= value;
        System.out.println("결과: " + result);
    }

    public void multiply(double value) {
        result *= value;
        System.out.println("결과: " + result);
    }

    public void divide(double value) {
        if (value != 0) {
            result /= value;
            System.out.println("결과: " + result);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    public double getResult() {
        return result;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("초기 값을 입력하세요:");
        double initialValue = scanner.nextDouble();
        Calculator calculator = new Calculator(initialValue);

        while (true) {
            System.out.println("현재 결과: " + calculator.getResult());
            System.out.println("원하는 연산자를 입력하세요 (+, -, *, /) 또는 '종료' 입력하여 종료:");
            String operation = scanner.next();

            if (operation.equals("종료")) {
                System.out.println("계산을 종료합니다. 최종 결과: " + calculator.getResult());
                break;
            }

            System.out.println("연산할 값을 입력하세요:");
            double value = scanner.nextDouble();

            switch (operation) {
                case "+":
                    calculator.add(value);
                    break;
                case "-":
                    calculator.subtract(value);
                    break;
                case "*":
                    calculator.multiply(value);
                    break;
                case "/":
                    calculator.divide(value);
                    break;
                default:
                    System.out.println("잘못된 연산자입니다. 다시 입력해 주세요.");
                    continue;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Calculator calculatorApp = new Calculator(0);
        calculatorApp.start();
    }
}
