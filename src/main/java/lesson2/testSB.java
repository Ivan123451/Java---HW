package lesson2;

import java.util.Scanner;

public class testSB {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("введите длину строки: ");
        int n = Integer.parseInt(number.next());
        System.out.println("веедите 1 занчение: ");
        String s1 = number.next();
        System.out.println("веедите 2 занчение: ");
        String s2 = number.next();
        String temp = s1 + s2;
        for (int i = 0; i < (n / 2); i++) {
                System.out.print(temp);
            }
            if (n%2 != 0) {
                System.out.print(s1);
            }



        }




    }

