package com.beb97.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        H2FileDatabaseExample h2 = new H2FileDatabaseExample();
        h2.start();
        System.out.println( "Hello World!" );
    }
}
