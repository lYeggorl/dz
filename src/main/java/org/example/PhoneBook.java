package org.example;
import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {

    HashMap<String, ArrayList<String>> secondNamePhones = new HashMap<>();


    public void add(String secondName, String phoneNumber) {
        if (!secondNamePhones.containsKey(secondName)){
            secondNamePhones.put(secondName, new ArrayList<String>());
        }
        var numbers = secondNamePhones.get(secondName);
        numbers.add(phoneNumber);
    }

    public ArrayList<String> get(String secondName) {
        return secondNamePhones.get(secondName);
    }
}