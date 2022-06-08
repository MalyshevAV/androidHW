package com.android;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
       fullName = "Pavel";
       age = 40;
    }

    public void move() {
        System.out.println(fullName + " двигается");
    }
    public void talk() {
        System.out.println(fullName + " говорит, ему " + age + " лет");
    }

    public static void main(String[] args) {
    Person person = new Person( "Иван", 30);
    person.move();
    person.talk();
    Person person1 = new Person();
    person1.move();
    person1.talk();
    }
}
