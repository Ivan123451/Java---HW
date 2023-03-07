package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;


//3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные
//        - равны ему.

public class task3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int i = 0;
        int j =arr.length -1;
        while (i < j) {
            if (arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j -= 1;

            }
            else {
                i+=1;
            }

        }
        System.out.println(Arrays.toString(arr));
    }




}
