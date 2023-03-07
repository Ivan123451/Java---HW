package HomeWork1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Веедите год: ");
        int year = Integer.parseInt(in.next());
        boolean find = false;
        if ((year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0)) {
            find = true;
        }
        System.out.println(find);

    }
}
