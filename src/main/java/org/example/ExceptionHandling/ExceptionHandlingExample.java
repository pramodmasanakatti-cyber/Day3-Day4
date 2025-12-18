package org.example.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;


public class ExceptionHandlingExample {
    public static void main(String[] args) throws NullPointerException, IOException {
        int a = 10;
        try {
            int result = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("this block always run");
        }

        // try-with-resources
        try (FileReader fr = new FileReader("data.txt")) {
            fr.read();
        } catch (IOException e) {
            System.out.println("can't read file");
        }


    }





}

