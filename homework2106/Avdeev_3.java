package homework2106;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Avdeev_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите целые числа или stop для остановки");
        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            } else if (input.equals("status")) {
                Collections.sort(numbers);
                System.out.println("Введенные числа (от меньшего к большему): " + numbers);
                continue;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод числа. Попробуйте еще раз.");
            }
        }
        if (!numbers.isEmpty()) {
            double average = numbers.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Не было введено ни одного числа.");
        }
    }
}