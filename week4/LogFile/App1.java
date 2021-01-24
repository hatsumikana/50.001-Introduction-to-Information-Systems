package com.hatsumi.week4.LogFile;

public class App1 {
    private static LogFile logFile;

    App1(){
        logFile = LogFile.getInstance();
        System.out.println(logFile);
    }
}
