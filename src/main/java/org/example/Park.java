package org.example;

import java.util.List;

public class Park {
    public String namePark;
    public int numeroattractions;
    public Attractions[] attractionsArray;

    public Park(String namePark, int num) {
        this.namePark = namePark;
        this.numeroattractions = num;
        this.attractionsArray = new Attractions[numeroattractions];
    }

    public static class Attractions {
        public String attractionsInfo;
        public String workingHours;
        public int price;
        public Attractions(String attractionsInfo, String workingHours, int price) {
            this.attractionsInfo = attractionsInfo;
            this.workingHours = workingHours;
            this.price = price;
        }
    }
}
