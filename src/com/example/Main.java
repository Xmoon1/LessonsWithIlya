package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;


@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./file.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello, world");

        pw.close();

    }
}