package lesson17.homework1;

import java.io.FileReader;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LoggerRunner {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        ZoneId zone = ZoneId.of("+07:00");
        ZonedDateTime zdt = ZonedDateTime.now(zone);
        OffsetDateTime data = zdt.toOffsetDateTime();
        long start = System.currentTimeMillis();
        long end = start + 60000;
        ExecutorService service = Executors.newFixedThreadPool(3);
        while (System.currentTimeMillis() < end) {
            Logger log = generate();
            Runnable logRun = () -> {
                try {
                    log.writer();
                    Thread.sleep((long) (Math.random() * 5000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Future<?> threadLog = service.submit(logRun);
            System.out.println("Текущее время: " + data + " статус: " + log.getLoggingLevel() +
                        " индитификатор потока: " + Thread.currentThread().getId() + " сообщение: "
                        + log.getMessage());
            threadLog.get();
        }

        FileReader reader = new FileReader("newLogger.txt");
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
