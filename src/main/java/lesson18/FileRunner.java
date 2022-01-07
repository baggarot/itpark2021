package lesson18;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.IOException;

public class FileRunner {

    @SneakyThrows({IOException.class})
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("text.txt", true)) {
            writer.write("""
                    У лукоморья дуб зелёный;
                    Златая цепь на дубе том:
                    И днём и ночью кот учёный
                    Всё ходит по цепи кругом;
                    Идёт направо — песнь заводит,
                    Налево — сказку говорит.
                    Там чудеса: там леший бродит,
                    Русалка на ветвях сидит;
                    Там на неведомых дорожках
                    Следы невиданных зверей;
                    Избушка там на курьих ножках
                    Стоит без окон, без дверей""");
            writer.flush();
        }
    }
}
