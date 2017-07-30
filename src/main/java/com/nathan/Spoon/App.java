package com.nathan.Spoon;

import spoon.Launcher;

public class App 
{
	
    public static void main( String[] args )
    {
    	String[] params = {"-i","J:\\eclipse-workspace\\Spoon\\src\\main\\java\\com\\nathan\\Spoon\\Utils","-p","com.nathan.Spoon.ClassProcessor"};
    	new Launcher().run(params);
       
    }
}
