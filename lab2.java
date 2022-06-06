package com.android;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hiddenNumber = 90;
        
        for (int i = 1; i <= 100; i++) {
            if (i > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (i < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляем! Вы угадали число " + hiddenNumber);
            }
        }  
    }
}
