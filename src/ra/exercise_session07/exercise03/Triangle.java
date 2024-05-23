package ra.exercise_session07.exercise03;

import java.util.Scanner;

public class Triangle {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    private String color;
    private double area;
    private double perimeter;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, double area, double perimeter) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Màu sắc của tam giác");
        this.color = scanner.nextLine();
        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        this.side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh thứ hai: ");
        this.side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh thứ ba: ");
        this.side3 = Double.parseDouble(scanner.nextLine());
    }

    public void getPerimeter() {
        this.perimeter = this.side1 + this.side2 + this.side3;
    }

    public void getArea() {
        this.area = (float)Math.sqrt((this.perimeter/2)*(this.perimeter/2-this.side1)*(perimeter/2-this.side2)*(perimeter/2-this.side3));
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "Side1 = " + this.side1 +
                ", Side2 = " + this.side2 +
                ", Side3 = " + this.side3 +
                ", Color = '" + this.color + '\'' +
                ", Area = " + this.area +
                ", Perimeter = " + this.perimeter +
                '}';
    }
}
