package com.android.Lab7;

import com.android.Lab7.Student;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String group, String firstName, String lastName, double averageMark, String scientificWork) {
        super(group, firstName, lastName, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    void getScholarship() {
        if (averageMark == 5) {
            System.out.println(getFirstName() +" "+ getLastName()+ " Сумма степендии 200 рублей");
        } else {
            System.out.println(getFirstName() + " "+ getLastName() + " Сумма степендии 180 рублей");
        }
    }
}

