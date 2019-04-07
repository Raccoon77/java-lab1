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
}