package org.example;

public class Rectangle implements Shapes, BorderColor, FillColor {

    private double a;
    private double b;
    private String fillColor;
    private String borderColor;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public String getFillColor(){
        return this.fillColor;
    }

    public String getBorderColor(){
        return this.borderColor;
    }

    @Override
    public double area() {
        return  a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2 ;
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
