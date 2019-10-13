import java.util.Scanner;

public class TestPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        PoinDeterm poinDeterm = new PoinDeterm();
        System.out.printf("Point (%d, %d) is %s", x, y, poinDeterm.result(point));

    }
}
