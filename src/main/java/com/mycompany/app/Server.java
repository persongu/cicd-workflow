package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        foo("no_use");
    }

    private void foo(String p) {
       String s = "aloha";
       System.out.println("This is a faulty message: %i", s);
    }

}
