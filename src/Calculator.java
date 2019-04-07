import java.util.Scanner;

public class Calculator {
    enum Actions {
        SUM, DIFFERENCE, MULTIPLICATION, DIVISION, VOLUME;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите действие: ");
        if (scanner.hasNextLine()) {
            String act = scanner.nextLine();
            Actions action = Actions.valueOf(act);
            switch (action) {
                case SUM:
                    sum();
                    break;
                case DIFFERENCE:
                    difference();
                    break;
                case VOLUME:
                    ballVolume();
                    break;
                case DIVISION:
                    division();
                    break;
                case MULTIPLICATION:
                    multiplication();
                    break;
            }
        }
    }

    private static void sum() {
        System.out.println("Введите 2 числа: ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                double sum = a + b;
                System.out.println(sum);
            }
        }
    }

    private static void difference() {
        System.out.println("Введите 2 числа: ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                double dif = a - b;
                System.out.println(dif);
            }
        }
    }

    private static void multiplication() {
        System.out.println("Введите 2 числа: ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                double m = a * b;
                System.out.println(m);
            }
        }
    }

    private static void division() {
        System.out.println("Введите 2 числа: ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                double d = a / b;
                System.out.println(d);
            }
        }
    }

    private static void ballVolume() {
        System.out.println("Введите радиус шара");
        if (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            double v = (4 * Math.PI * Math.pow(r, 3)) / 3;
            System.out.println(v);
        }
    }
}