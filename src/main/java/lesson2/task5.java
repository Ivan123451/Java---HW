package lesson2;

import java.io.File;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        ex5("D:\\курс GB\\java_lectures\\java-practic020323\\java-practic0203231");
        
    }

    private static void ex5(String pathDir) {
        String[] arr = new String[0];
        try {
            arr = concetPathToNamesarr(pathDir);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static String[] concetPathToNamesarr(String path) {
        File dir = new File(path);
        if (!dir.isDirectory()) {
//            return new String[]{};
            throw new RuntimeException("По заданному пути нет дирректории");
        }
        return dir.list();


    }
}
