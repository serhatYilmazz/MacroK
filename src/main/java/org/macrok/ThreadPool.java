package org.macrok;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    private static ExecutorService executorService;

    public static ExecutorService executorService() {
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(25);
        }

        return executorService;
    }

}
