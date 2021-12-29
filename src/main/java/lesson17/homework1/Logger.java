package lesson17.homework1;

import java.io.FileWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Logger {

    private String message;
    private LoggingLevel loggingLevel;

    public Logger(String message, LoggingLevel loggingLevel) {
        this.message = message;
        this.loggingLevel = loggingLevel;
    }

    public String getMessage() {
        return message;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public void writer() {
        ZoneId zone = ZoneId.of("+07:00");
        ZonedDateTime zdt = ZonedDateTime.now(zone);
        OffsetDateTime data = zdt.toOffsetDateTime();
        try (FileWriter writer = new FileWriter("newLogger.txt", true)) {
            writer.write("Текущее время: " + data + " статус: " + loggingLevel +
                    " сообщение: " + message);
            writer.append("\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
