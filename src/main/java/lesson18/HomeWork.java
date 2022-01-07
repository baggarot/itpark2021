package lesson18;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork {

    @SneakyThrows({IOException.class})
    public static void main(String[] args) {
        FileReader reader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int num = numString();
        String[] lines = new String[num];
        for (int i = 0; i < num; i++) {
            lines[i] = bufferedReader.readLine();
            try (FileWriter writer = new FileWriter("file" + i + ".txt", true)) {
                writer.write(lines[i]);
                writer.flush();
            }
        }
        bufferedReader.close();
    }

    @SneakyThrows({IOException.class})
    private static int numString() {
        FileReader reader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int num = 0;
        while (bufferedReader.readLine() != null) num++;
        bufferedReader.close();
        return num;
    }
}
