package org.example;
import java.lang.Math;

public class Triangle implements Shapes, BorderColor, FillColor {

    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public String getFillColor(){
        return this.fillColor;
    }

    public String getBorderColor(){
        return this.borderColor;
    }

    @Override
    public double area() {
        double h = (a + b + c)/2;
        return Math.sqrt(h * (h - a) * (h - b) * (h - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void setBorderColor(String borderColor){
        this.borderColor = borderColor;
    }

    @Override
    public void setFillColor(String fillColor){
        this.fillColor = fillColor;
    }
}

