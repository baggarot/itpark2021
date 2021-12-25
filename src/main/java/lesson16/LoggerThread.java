package lesson16;

import java.io.IOException;

public class LoggerThread extends Thread {

    private final Logger logger;

    public LoggerThread(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run() {
        try {
            logger.writer();
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
