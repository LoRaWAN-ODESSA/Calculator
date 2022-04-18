import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            double result = 0;
            Scanner firstNum = new Scanner(System.in);
            System.out.println("Enter first number:");
            double num1 = firstNum.nextDouble();

            Scanner operator = new Scanner(System.in);
            System.out.println("Enter operator (+, -, /, *):");
            String operator1 = operator.nextLine();

            Scanner secondNum = new Scanner(System.in);
            System.out.println("Enter second number:");
            double num2 = firstNum.nextDouble();

            switch (operator1) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                case "/":
                    if (num2 == 0.0) {
                        break;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                default:
                    System.out.println("Unknown operator");
                    return;
            }

            if(operator1 != "/" && num2 != 0.0) {
                System.out.println(num1 + " " + operator1 + " " + num2 + " = " + result);
                } else {
                System.out.println("You can't divide by 0");

            }



        }
    }
}