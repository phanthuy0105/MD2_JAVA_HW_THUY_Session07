package ra.exercise_session07.exercise05;

public class ArrayCalculator {
    public static int maxOfArray(int[] arr) {
        // Tìm giá trị bé nhất trong mảng arr số nguyên
        int max = arr[0];
        for (int number: arr) {
            if(max < number) {
                max = number;
            }
        }
        return max;
    }
    // Tìm giá trị lớn nhất trong mảng arr số thực
    public static double maxOfArray(double[] arr) {
        double max = arr[0];
        for (double number: arr) {
            if(max < number) {
                max = number;
            }
        }
        return max;
    }

    // Tìm giá trị bé nhất trong mảng arr số nguyên
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int number: arr) {
            if(min > number) {
                min = number;
            }
        }
        return min;
    }

    // Tìm giá trị bé nhất trong mảng arr số thực
    public static double minOfArray(double[] arr) {
        double min = arr[0];
        for (double number: arr) {
            if(min > number) {
                min = number;
            }
        }
        return min;
    }
}
