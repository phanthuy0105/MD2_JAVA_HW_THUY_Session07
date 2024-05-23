package ra.exercise_session07.exercise03;

import java.util.Scanner;

public class TriangleRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.inputData(scanner);
        triangle.getPerimeter();
        triangle.getArea();
        System.out.println(triangle);
    }
}
