package ra.exercise_session07.exercise04;

public class ArrayCalculator {
    // Tổng của mảng arr số nguyên
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Tổng của mảng arr số thực
    public static double sumOfArray(double[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
