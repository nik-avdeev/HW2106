package homework2106;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Avdeev_7 {
    public static void main(String[] args) {
        File inputFile = new File("/Users/nikavdeev/IdeaProjects/Avdeev_00/src/homework2106/input");
        File outputFile = new File("/Users/nikavdeev/IdeaProjects/Avdeev_00/src/homework2106/output");

        try {
            List<String> lines = readMatrixLines(inputFile);
            Collections.reverse(lines);

            writeLines(outputFile, lines);

            System.out.println("Операция выполнена успешно");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }

    public static List<String> readMatrixLines(File inputFile) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();

        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                lines.add(line);
            }
        }
        scanner.close();

        return lines;
    }

    public static void writeLines(File outputFile, List<String> lines) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(outputFile);
        for (String line : lines) {
            writer.println(line);
        }
        writer.close();
    }
}
