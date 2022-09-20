package org.lessons.lesson8;

import java.io.*;
import java.util.Arrays;

public class FinancialReport {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java\\repos\\java_core_3\\src\\report.csv";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        int countLine = 0;
        int finalPrice = 0;
        while (bufferedReader.ready()){
            if(countLine == 0){
                bufferedReader.readLine();
                countLine++;
                continue;
            }
            String line = bufferedReader.readLine();
            String[] fields = line.split(";");
            int goodAllPrice = Integer.parseInt(fields[1]) * Integer.parseInt(fields[2]);
            finalPrice+=goodAllPrice;
            countLine++;

        }
        System.out.println(finalPrice);
        bufferedReader.close();

    }
}