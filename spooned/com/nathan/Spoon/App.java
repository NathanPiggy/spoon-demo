package com.nathan.Spoon;


public class App {
    private java.lang.String appName;

    public App() {
        super();
    }

    public App(java.lang.String appName) {
        super();
        this.appName = appName;
    }

    public static void main(java.lang.String[] args) {
        java.lang.String[] params = new java.lang.String[]{ "-i" , "J:\\eclipse-workspace\\Spoon\\src\\main\\java\\com\\nathan\\Spoon\\App.java" , "-p" , "com.nathan.Spoon.ClassProcessor" };
        new spoon.Launcher().run(params);
    }
}

