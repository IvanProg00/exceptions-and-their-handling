package geekbrains.lessons.lesson2.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite() {
        try {
            Map<String, String> data = readFile("test.txt");
            replaceText(data);
            saveToFile("test1.txt", data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error in writing to file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid transformation: " + e.getMessage());
        }
    }

    private static Map<String, String> readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        Map<String, String> result = new LinkedHashMap<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] temp = line.split("=");
            if (temp.length == 2) {
                result.put(temp[0], temp[1]);
            }
        }

        sc.close();

        return result;
    }

    private static void saveToFile(String filePath, Map<String, String> data) throws IOException {
        FileWriter writer = new FileWriter(filePath);

        for (Map.Entry<String, String> entry : data.entrySet()) {
            writer.write(entry.toString());
            writer.write('\n');
            writer.flush();
        }

        writer.close();
    }

    private static void replaceText(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();

            if (val.equals("?")) {
                entry.setValue(String.valueOf(key.length()));
            } else if (!val.matches("[0-9]+")) {
                throw new IllegalArgumentException("Error in string: " + entry);
            }
        }
    }
}
