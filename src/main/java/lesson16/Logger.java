package lesson16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {

    private final String message;
    LoggingLevel loggingLevel;

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

    public void writer() throws IOException {
        Date data = new Date();
        FileWriter writer = new FileWriter("logger.txt", true);
        writer.write("Текущее время: " + data + " статус: " + getLoggingLevel() +
                    " сообщение: " + getMessage());
        writer.append("\n");
        writer.flush();
        writer.close();
    }
}
