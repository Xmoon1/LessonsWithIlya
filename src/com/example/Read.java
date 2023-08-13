package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "."+separator+"file.txt";
        File file = new File(path);

        Scanner input = new Scanner(file);
//        while(input.hasNextLine()){
//            System.out.println(input.nextLine());
//        }

//        String line = input.nextLine();
//
//        String[] words = line.split(" ");
//        int[] numbers = new int[5];
//        for (String number: words
//             ) {
//
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = Integer.parseInt(number);
//            }
//        }
//
//        for (Integer number: numbers){
//            System.out.println(number);
//        }
        PrintWriter pw = new PrintWriter("./output");
        int count = 0;
        int sum = 0;


        while (input.hasNextLine()){
            sum += Integer.parseInt(input.nextLine());
            count++;
        }

        pw.println(sum/count);

        pw.close();
        input.close();
    }
}
