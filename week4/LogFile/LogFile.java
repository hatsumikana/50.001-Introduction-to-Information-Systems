package com.hatsumi.week4.LogFile;

public class LogFile {
    // Singleton design method
    private static LogFile instance = null;
    private LogFile(){

    }

    public static LogFile getInstance(){
        if(instance == null){
            instance = new LogFile();
        }
        return instance;
    }
}
