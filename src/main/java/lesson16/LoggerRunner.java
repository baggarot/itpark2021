package lesson16;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class LoggerRunner {

    public static void main(String[] args) throws IOException, InterruptedException {
        Date data = new Date();
        long start = System.currentTimeMillis();
        long end = start + 60000;
        while (System.currentTimeMillis() < end) {
            Logger firstLog = generate();
            LoggerThread firstThread = new LoggerThread(firstLog);
            firstThread.start();
            System.out.println("Текущее время: " + data + " статус: " + firstLog.getLoggingLevel() +
                    " индитификатор потока: " + firstThread.getId() + " сообщение: " + firstLog.getMessage());
            firstThread.join();

            Logger secondLog = generate();
            LoggerThread secondThread = new LoggerThread(secondLog);
            secondThread.start();
            System.out.println("Текущее время: " + data + " статус: " + secondLog.getLoggingLevel() +
                    " индитификатор потока: " + secondThread.getId() + " сообщение: " + secondLog.getMessage());
            secondThread.join();

            Logger thirdLog = generate();
            LoggerThread thirdThread = new LoggerThread(thirdLog);
            thirdThread.start();
            System.out.println("Текущее время: " + data + " статус: " + thirdLog.getLoggingLevel() +
                    " индитификатор потока: " + thirdThread.getId() + " сообщение: " + thirdLog.getMessage());
        }

        FileReader reader = new FileReader("logger.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        reader.close();
    }

    private static Logger generate() {
        Random random = new Random();
        int randomMessage = random.nextInt();
        String message = "Сообщение" + randomMessage;
        int randomLog = random.nextInt(5);
        LoggingLevel loggingLevel = switch (randomLog) {
            case 0 -> LoggingLevel.ERROR;
            case 1 -> LoggingLevel.WARN;
            case 2 -> LoggingLevel.INFO;
            case 3 -> LoggingLevel.DEBUG;
            case 4 -> LoggingLevel.TRACE;
            default -> throw new IllegalStateException("Unexpected value: " + randomLog);
        };
        return new Logger(message, loggingLevel);
    }
}
