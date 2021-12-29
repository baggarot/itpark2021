package lesson17;

import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class HomeWork2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        HashSet<Integer> number = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            int randomNumber = random.nextInt();
            number.add(randomNumber);
        }

        Executor executor = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> max = CompletableFuture.supplyAsync(() -> number.stream().mapToInt(i -> i)
                .max().orElse(0), executor);
        CompletableFuture<Integer> min = CompletableFuture.supplyAsync(() -> number.stream().mapToInt(i -> i)
                .min().orElse(0), executor);
        CompletableFuture<Double> avg = CompletableFuture.supplyAsync(() -> number.stream().mapToInt(i -> i)
                .average().orElse(0), executor);

        System.out.println(max.get());
        System.out.println(min.get());
        System.out.println(avg.get());
    }
}
