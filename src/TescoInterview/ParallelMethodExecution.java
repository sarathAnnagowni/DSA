package TescoInterview;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ParallelMethodExecution {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> method1());
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> method2());

        // Wait for both futures to complete and get their results
        try {
            String result1 = future1.get();
            String result2 = future2.get();

            System.out.println("Result from method1: " + result1);
            System.out.println("Result from method2: " + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static String method1() {
        // Simulate some time-consuming operation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Result from method1";
    }

    private static String method2() {
        // Simulate some time-consuming operation
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Result from method2";
    }
}
