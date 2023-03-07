package lesson1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printHelloWorld();
//        inputNameAndPrint();
        maxOf1();
    }

    private static void maxOf1() {
        int[] array = {1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        int count = 0;
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count += 1;
                if (count > maximum) {
                    maximum = count;
                    }

            }
                    else {
                    count = 0;

            }


        }
        System.out.println(maximum);
    }

//    private static void printHelloWorld() {
//
//        System.out.println("Hello, world!");
//    }
//
//    //countApple
//    //final int COUNT_APPLE
//    private static void inputNameAndPrint() {
//        Scanner in =  new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String name = in.next();
////        System.out.printf("%s %3d %.2f", "hello", 3, 5.546456456546);
//        System.out.printf("Hello, %s", name);
//        System.out.println();
//        System.out.print("сейчас " + LocalDateTime.now());
//
//
//
//    }
//
//
}
