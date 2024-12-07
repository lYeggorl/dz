package org.example;

public class OneEmployee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public OneEmployee() {
        name = "Ivan Vanya";
        position = "Space Trooper";
        email = "Vanya@mailbox.com";
        phone = "984564531536";
        salary = 29000;
        age = 29;
        System.out.println("Задание 1 :" + name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}

