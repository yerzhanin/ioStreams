package com.epam;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "qwerty";

        File file1 = new File("File1.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = new FileWriter("File1.txt");
        fw.write(text);
        fw.flush();

        File file2 = new File("File2.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fRead = new FileInputStream("File1.txt");
        FileOutputStream fWrite = new FileOutputStream("File2.txt");
        int c;
        while ((c = fRead.read())!= -1)
            fWrite.write((char)c);
        System.out.println("Copied!");

        fRead.close();
        fWrite.close();
    }

}