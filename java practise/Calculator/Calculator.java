import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Types of operations:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Choose an operation:");
        int choose = scanner.nextInt();
        if (choose == 1) {
            System.out.println("Enter the first number:");
            int x = scanner.nextInt();
            System.out.println("Enter the second number:");
            int y = scanner.nextInt();
            int sum = Addition(x, y);
            System.out.println("The result is " + sum);
        }
        if (choose == 2) {
            System.out.println("Enter the first number:");
            int x = scanner.nextInt();
            System.out.println("Enter the second number:");
            int y = scanner.nextInt();
            int sum = Subtraction(x, y);
            System.out.println("The result is " + sum);
        }
        if (choose == 3) {
            System.out.println("Enter the first number:");
            int x = scanner.nextInt();
            System.out.println("Enter the second number:");
            int y = scanner.nextInt();
            int sum = Multiplication(x, y);
            System.out.println("The result is " + sum);
        }
        if (choose == 4) {
            System.out.println("Enter the first number:");
            int x = scanner.nextInt();
            System.out.println("Enter the second number:");
            int y = scanner.nextInt();
            int sum = Division(x, y);
            System.out.println("The result is " + sum);
        }

    }

    public static int Addition(int x, int y) {
        int total = x + y;
        return total;
    }

    public static int Subtraction(int x, int y) {
        int total = x - y;
        return total;
    }

    public static int Multiplication(int x, int y) {
        int total = x * y;
        return total;
    }

    public static int Division(int x, int y) {
        int total = x / y;
        return total;
    }

}