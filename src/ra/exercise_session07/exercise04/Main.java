package ra.exercise_session07.exercise04;

public class Main {
    public static void main(String[] args) {
        // Tổng của mảng arr số nguyên
        int[] myArr = {1,3,5,6,7,9,15,20};
        int sum = ArrayCalculator.sumOfArray(myArr);
        System.out.println("Tổng của mảng số nguyên là: " + sum);

        // Tổng của mảng arr số thực
        double[] myArr2 = {-1,-3.5,(5/10),6};
        double sum2 = ArrayCalculator.sumOfArray(myArr2);
        System.out.println("Tổng của mảng số thực là: " + sum2);
    }
}
