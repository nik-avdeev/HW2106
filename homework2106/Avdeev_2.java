package homework2106;

import java.util.Scanner;

public class Avdeev_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Введите целые числа или stop для остановки");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Повторите попытку.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Нет введенных чисел.");
        }
    }
}
