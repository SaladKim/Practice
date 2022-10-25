package com.acompany.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("hello "+i);
            }
        };

        Runnable goodbyes = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("goodbye " +i );
            }
        };

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(hellos);
        service.execute(goodbyes);
        service.shutdown();

        System.out.println("Main Thread here......................");
    }
}
