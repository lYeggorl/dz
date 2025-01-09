package org.example;

public class Circle implements Shapes, BorderColor, FillColor {
    private double r;
    private String fillColor;
    private String borderColor;

    public Circle(double r) {
    this.r = r;
    }

    public String getFillColor(){
        return this.fillColor;
    }

    public String getBorderColor(){
        return this.borderColor;
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * r;
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
