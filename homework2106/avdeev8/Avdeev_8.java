package homework2106.avdeev8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Avdeev_8 {
    public static void main(String[] args) {
        File inputFile1 = new File("/Users/nikavdeev/IdeaProjects/Avdeev_00/src/homework2106/avdeev8/INPUT_1");
        File inputFile2 = new File("/Users/nikavdeev/IdeaProjects/Avdeev_00/src/homework2106/avdeev8/INPUT_2");
        File outputFile = new File("/Users/nikavdeev/IdeaProjects/Avdeev_00/src/homework2106/avdeev8/OUTPUT_1");

        try {
            Set<String> lines1 = readLines(inputFile1);
            Set<String> lines2 = readLines(inputFile2);

            Set<String> commonLines = findCommonLines(lines1, lines2);

            writeLines(outputFile, commonLines);

            System.out.println("Операция выполнена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }

    public static Set<String> readLines(File inputFile) throws FileNotFoundException {
        Set<String> lines = new HashSet<>();

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

    public static Set<String> findCommonLines(Set<String> lines1, Set<String> lines2) {
        Set<String> commonLines = new HashSet<>();

        for (String line : lines1) {
            if (lines2.contains(line)) {
                commonLines.add(line);
            }
        }

        return commonLines;
    }

    public static void writeLines(File outputFile, Set<String> lines) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(outputFile);
        for (String line : lines) {
            writer.println(line);
        }
        writer.close();
    }
}
