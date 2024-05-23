package ra.exercise_session07.exercise05;

import ra.exercise_session07.exercise05.ArrayCalculator;

public class Main {
    public static void main(String[] args) {
        // Tìm giá trị lớn nhất trong mảng arr số nguyên
        int[] myArr = {1, 3, 5, 6, 7, 9, 15, 20};
        int max = ArrayCalculator.maxOfArray(myArr);
        System.out.println("Số lớn nhất trong mảng số nguyên là: " + max);

        // Tìm giá trị lớn nhất trong mảng arr số thực
        double[] myArr2 = {-1, -3.5, (5 / 10), 6, 22, 8};
        double max2 = ArrayCalculator.maxOfArray(myArr2);
        System.out.println("Số lớn nhất trong mảng số thực là: " + max2);

        // Tìm giá trị bé nhất trong mảng arr số nguyên
        int[] myArr3 = {1, 3, 5, 6, 7, 9, 15, 20};
        int min = ArrayCalculator.minOfArray(myArr3);
        System.out.println("Số bé nhất trong mảng số nguyên là: " + min);

        // Tìm giá trị bé nhất trong mảng arr số thực
        double[] myArr4 = {-1, -3.5, (5 / 10), 6, 22, 8};
        double min2 = ArrayCalculator.minOfArray(myArr4);
        System.out.println("Số bé nhất trong mảng số thực là: " + min2);
    }
}
