package com.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


@SuppressWarnings("all")
public class Exceptions {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("./");
            printWriter.println(3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        Exceptions exceptions = new Exceptions();
    }


    @Deprecated
    public void test(){
        System.out.println("Hello");
    }
}
