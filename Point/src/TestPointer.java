import java.util.Scanner;

public class TestPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        // point.setX(scanner.nextInt());
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter y");
        //point.setY(scanner.nextInt());
        int y = scanner.nextInt();
        scanner.nextLine();
        Point point = new Point(x, y);
        PoinDeterm poinDeterm = new PoinDeterm();
        System.out.printf("Point (%d, %d) is %s", x, y, poinDeterm.result(point));
        scanner.close();
    }
}
