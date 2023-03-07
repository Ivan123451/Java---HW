package HomeWork1;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 8, 10, 0};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }

        }
    System.out.println("максимальное число - "+ max);
    System.out.println("минимальное число - "+ min);
    }
}
