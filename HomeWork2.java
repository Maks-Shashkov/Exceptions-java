import java.util.Scanner;

public class HomeWork2 {
    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        float input;
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                input = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка! Пожалуйста, введите дробное число.");
                scanner.nextLine();
            }
        }
        return input;
    }


    public static void checkInput(String input) {
        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        float number = inputFloat();
        System.out.println("Вы ввели число: " + number);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        checkInput(input);
    }



}

