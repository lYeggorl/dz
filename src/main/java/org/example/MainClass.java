package org.example;

public class MainClass {
    public static void main(String[] args) {
        Employees employee1 = new Employees("Ivan Vanya", "Space Trooper", "Vanya@mailbox.com", "984564531536", 29000, 29);
        System.out.println("Задание 1 :" + employee1.name + ", " + employee1.position + ", " + employee1.email + ", " + employee1.phone + ", " + employee1.salary + ", " + employee1.age);

        Employees[] employeesArray = new Employees[5];
        employeesArray [0] = new Employees("Zhora", "Invisible Product Sales Manager", "ZhoraSaler@mailbox.com", "880001561", 9000, 19);
        employeesArray [1] = new Employees("Arsen", "Galaxy Emperor", "justemperer@mailbox.com", "8999555551", 10000000, 22);
        employeesArray [2] = new Employees("Grishka Beliy", "Cleaner", "cleanFloor@mailbox.com", "9846516531", 97000, 94);
        employeesArray [3] = new Employees("Varliriy Miladze", "Penguin's barista", "hatePenguins@mailbox.com", "8800151151", 12, 59);
        employeesArray [4] = new Employees("George Temniy", "Chief Happiness Officer for Office Plants", "loveFlowers@mailbox.com", "8811155432", 60000, 8);
        System.out.println("Задание 2 с проверкой через геттер :" + employeesArray [0].getEmail());

        Park park1 = new Park("Park mokriy", 2);
        park1.attractionsArray[0] = new Park.Attractions("water gorki", "10:00 - 24:30", 13);

        park1.attractionsArray[1] = new Park.Attractions("mega water", "10:00 - 11:30", 1);

        System.out.println("Задание 3 :" + park1.namePark + ", " + park1.attractionsArray[0].attractionsInfo  + ", " + park1.attractionsArray[0].workingHours);
        System.out.println("Задание 3 :" + park1.namePark + ", " + park1.attractionsArray[1].attractionsInfo  + ", " + park1.attractionsArray[1].workingHours);

    }
}

