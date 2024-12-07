package org.example;

public class MainClass {
    public static void main(String[] args) {
        OneEmployee employee1 = new OneEmployee();
        Park park1 = new Park();

        Employees[] employeesArray = new Employees[5];
        employeesArray [0] = new Employees("Zhora", "Invisible Product Sales Manager", "ZhoraSaler@mailbox.com", "880001561", 9000, 19);
        employeesArray [1] = new Employees("Arsen", "Galaxy Emperor", "justemperer@mailbox.com", "8999555551", 10000000, 22);
        employeesArray [2] = new Employees("Grishka Beliy", "Cleaner", "cleanFloor@mailbox.com", "9846516531", 97000, 94);
        employeesArray [3] = new Employees("Varliriy Miladze", "Penguin's barista", "hatePenguins@mailbox.com", "8800151151", 12, 59);
        employeesArray [4] = new Employees("George Temniy", "Chief Happiness Officer for Office Plants", "loveFlowers@mailbox.com", "8811155432", 60000, 8);
    }
}

