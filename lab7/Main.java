package com.android.Lab7;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("2", "Павел", "Петров", 5);
        Student aspirant = new Aspirant("3", "Иван", "Сидоров", 3, "Математика");

        Student[] students = {student, aspirant};
        for (Student s: students) {
            s.getScholarship();
        }
    }
}
