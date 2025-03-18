package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/weatherdata.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(","); // Assuming CSV is comma-separated
                System.out.println(Arrays.toString(columns));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}