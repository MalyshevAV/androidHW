package com.android.Lab7;

public class Student {
    String group;
    String firstName;
    String lastName;
    double averageMark;

    public Student(String group, String firstName, String lastName, double averageMark) {
        this.group = group;
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public String getGroup() {
        return group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    void getScholarship() {
        if (averageMark == 5) {
            System.out.println(getFirstName() + " " + getLastName() + " Сумма степендии 100 рублей");
        } else {
            System.out.println("Сумма степендии 80 рублей");
        }
    }
}





