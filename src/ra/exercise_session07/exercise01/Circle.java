package ra.exercise_session07.exercise01;

import java.util.Scanner;

public class Circle {
    private float radius;
    private String color;
    private float PI = 3.14F;
    private float area;

    public Circle() {
    }

    public Circle(float radius, String color, float PI, float area) {
        this.radius = radius;
        this.color = color;
        this.PI = PI;
        this.area = area;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPI() {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void inputDataCircle(Scanner scanner) {
        System.out.println("Nhập bán kính đường tròn: ");
        this.radius = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập màu sắc đường tròn: ");
        this.color = scanner.nextLine();
    }

    public void area() {
        this.area = PI * radius * radius;
    }

    public String toString() {
        return "Radius: " + this.radius + " Color: " + this.color + " Area: " + (this.area);
    }
}
