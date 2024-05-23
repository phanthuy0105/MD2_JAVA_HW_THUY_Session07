package ra.exercise_session07.exercise01;

import ra.exercise_session07.exercise01.Circle;
import ra.exercise_session07.exercise01.Cylinder;

import java.util.Scanner;

public class CircleRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();
        cylinder.inputData(scanner);
        cylinder.area();
        cylinder.volume();
        System.out.println(cylinder);
    }
}
