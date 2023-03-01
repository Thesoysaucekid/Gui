public class main {
    import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Calculator!");
    System.out.println("Enter the first number:");
    double num1 = input.nextDouble();
    System.out.println("Enter the second number:");
    double num2 = input.nextDouble();
    System.out.println("Enter the operation (+, -, *, /):");
    String operator = input.next();
    double result;
    switch (operator) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator!");
        return;
    }
    System.out.println("The result is: " + result);
  }
}

}
