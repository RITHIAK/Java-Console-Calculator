import java.util.Scanner;

public class Main {

    // Addition Method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction Method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication Method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division Method
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== JAVA CONSOLE CALCULATOR =====");

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("\nChoose Operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Answer = " + add(a, b));
                    break;

                case 2:
                    System.out.println("Answer = " + subtract(a, b));
                    break;

                case 3:
                    System.out.println("Answer = " + multiply(a, b));
                    break;

                case 4:
                    System.out.println("Answer = " + divide(a, b));
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            String again = sc.next();

            if (!again.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Program Ended.");
        sc.close();
    }
}