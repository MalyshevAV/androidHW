package com.android;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) throws Exception {
        String str = "Нить натяни — оборвется.\n" +
                "Счастье, что хрупкий хрусталь.\n" +
                "Стукнешь слегка — разобьётся.\n" +
                "И потерять его жаль.";

        File file = new File("C:\\Users\\Sasha\\android\\ labRab_1\\src\\com\\android\\Example.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write(str);
        writer.flush();
        writer.close();

        // Создание объекта FileReader
        FileReader fr = new FileReader(file);
        char [] a = new char[50];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив
        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();
    }
}





