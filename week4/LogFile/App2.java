package com.hatsumi.week4.LogFile;

public class App2 {
    public static LogFile a = null;
    App2(){
        a = LogFile.getInstance();
        System.out.println(a);
    }
}
