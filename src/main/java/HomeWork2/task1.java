package HomeWork2;

import java.util.Scanner;

//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка
//        палиндромом (возвращает boolean значение).
public class task1 {
    public static void main(String[] args) {

        System.out.println(isPalindrom());

    }

    private static boolean isPalindrom() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите слово: ");
        String word = in.nextLine();

        int i = 0;
        int j = word.length() - 1;
        while (i<j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;

            }

            i++;
            j--;
        }
        return true;


    }
}
