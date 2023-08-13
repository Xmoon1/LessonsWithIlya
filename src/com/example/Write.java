package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "."+separator+"file.txt";
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello, world");
        pw.println("Welcome to Intellij Idea");

        pw.close();

    }
}
