package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Dog");
        words.add("Mouse");
        words.add("Rat");
        words.add("Parrot");
        words.add("Hamster");
        words.add("Pig");
        words.add("Rabbit");
        words.add("Mouse");
        words.add("Dog");
        words.add("Fish");
        words.add("Lizard");
        words.add("Parrot");
        words.add("Mouse");
        words.add("Spider");

        HashSet<String> setWords = new HashSet<>(words);

        System.out.println("Список всех слов без повторов : " + setWords);

        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }

        for (HashMap.Entry<String, Integer> o : count.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }


        PhoneBook secondNamePhones = new PhoneBook();
        secondNamePhones.add("Ivanov", "79865411515");
        secondNamePhones.add("Monitorov", "79861548736");
        secondNamePhones.add("Saharov", "79869514736");
        secondNamePhones.add("Kolonkov", "79865214968");
        secondNamePhones.add("Ochistitel", "79863268451");
        secondNamePhones.add("Monitorov", "79869528463");
        secondNamePhones.add("Ivanov", "79862525847");
        secondNamePhones.add("Vodichkov", "79862615487");
        secondNamePhones.add("Ivanov", "79863652365");

        String lastName = "Ivanov";

        System.out.println(lastName + " " + secondNamePhones.get(lastName));
    }
}
