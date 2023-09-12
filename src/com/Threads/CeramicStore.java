package com.Threads;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class CeramicStore {
    public static void runAndWait(List<Runnable> runnables) {

        List<Thread> listOfThreads = new ArrayList<>();
        for(Runnable runn : runnables){
            Thread thread = new Thread(runn);
            listOfThreads.add(thread);
        }
        try{
            for(Thread thread : listOfThreads){
                thread.start();
            }
            for(Thread thread : listOfThreads){
                thread.join();
            }

        }catch (Exception e){

        }


    }

    public static void main(String[] args) {
        List<Runnable> runnables = Arrays.asList(() -> {
            try {
                Thread.sleep(800);
                System.out.println("Slow function");
            } catch(Exception e) {}
        }, () -> {
            try {
                Thread.sleep(100);
                System.out.println("Fast function");
            } catch(Exception e) {}
        });

        // Expected output:
        // Fast function
        // Slow function
        // Returned from the method!
        runAndWait(runnables);
        System.out.println("Returned from the method!");
    }
}
