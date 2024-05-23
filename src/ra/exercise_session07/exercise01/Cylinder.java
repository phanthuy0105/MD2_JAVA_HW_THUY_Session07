package ra.exercise_session07.exercise01;

import java.util.Scanner;

public class Cylinder extends Circle {
    //    public void color(){
//        super.setColor("xanh");
//    }
    private float height;
    private float volume;

    public Cylinder() {
    }

    public Cylinder(float radius, String color, float PI, float area, float height, float volume) {
        super(radius, color, PI, area);
        this.height = height;
        this.volume = volume;
    }

    public Cylinder(float radius, String color, float PI, float area) {
        super(radius, color, PI, area);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void inputData(Scanner scanner) {
        super.inputDataCircle(scanner);
        System.out.println("Nhập chiều cao của hình trụ tròn: ");
        this.height = Float.parseFloat(scanner.nextLine());
    }

    public void volume() { // V = pi * r^2 * height
        this.volume = super.getPI() * super.getRadius() * super.getRadius() * this.height;
        System.out.printf("Thể tích hình trụ tròn: %.2f\n", this.volume);
    }

    @Override
    public String toString() {
        return "Cylinder {" + super.toString() + "Height = " + this.height + ", Volume = " + this.volume + '}';
    }
}
