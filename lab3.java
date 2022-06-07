package com.android;

public class lab3 {
    public static void main(String[] args) {
        int result = 1;
        int array [] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++){
          result *= array[i];
        }
        System.out.println("Произведение элеиентов массива " + result);
    }
}
