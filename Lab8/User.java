package com.android.Lab8;

public class User implements  Administraror, reader, laibrarian, supplierBooк {
    String name;
    String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void findBook() {
        System.out.println( name + role + " " + " находит и выдает книги");
    }

    @Override
    public void orderBook() {
        System.out.println( name + " " + role + " " + " заказывает книги");
    }

    @Override
    public void getBook() {
        System.out.println(name + " " + role + " берет и возвращает книги");
    }

    @Override
    public void bringBook() {
        System.out.println(name + " " + role+ " приносит книги в библиотеку");
    }


    public static void main(String[] args) {
        User reader = new User ("Ivan", "Reader");
        reader.getBook();
        User administrator = new User("Masha", " Administrator");
        administrator.findBook();
        User laibrarian = new User("Petr", "liabrarian");
        laibrarian.orderBook();
    }
}