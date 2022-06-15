package com.android.Lab9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class fileReader {
    public static void main(String[] args) throws Exception {
//        Создать два текстовых документа с помощью IDEA. Наполнить их произвольным текстом.
//        Из первого текстового файла во второй надо переписать все строки,
//        вставив в конец каждой строки ее длину.

        //Create files
        String str = "Нить натяни — оборвется.\n" +
                "Счастье, что хрупкий хрусталь.\n" +
                "Стукнешь слегка — разобьётся.\n" +
                "И потерять его жаль.";

        File createFile = new File("C:\\Users\\Sasha\\android\\ labRab_1\\src\\com\\android\\Lab9\\mynewfile.txt");
        createFile.createNewFile();
        File createCopyFile = new File("C:\\Users\\Sasha\\android\\ labRab_1\\src\\com\\android\\Lab9\\newCopyfile.txt");
        createCopyFile.createNewFile();

        // write String
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Sasha\\android\\ labRab_1\\src\\com\\android\\Lab9\\mynewfile.txt");
        byte[] buffer = str.getBytes(StandardCharsets.UTF_8);
        fos.write(buffer);

        // copy String
        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader("C:\\Users\\Sasha\\android\\ labRab_1\\src\\com\\android\\Lab9\\mynewfile.txt"));
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("C:\\Users\\Sasha\\android\\ labRab_1\\src\\com\\android\\Lab9\\newCopyfile.txt"));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + " "+  line.length());
                writer.write('\n');
            }
        }
    }
}