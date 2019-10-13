import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fisrt value");
        double a = scanner.nextDouble();
        System.out.println("Enter second value");
        double b = scanner.nextDouble();
        System.out.println("Result of calculation is " + calculator.result(a, b));
    }
}
