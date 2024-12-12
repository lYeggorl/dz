package org.example;

public class Employees {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;
    public Employees(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
}

