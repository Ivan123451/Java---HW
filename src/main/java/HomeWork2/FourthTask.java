package HomeWork2;

import java.io.FileOutputStream;
import java.io.IOException;

class FourthTask {

    public StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

            fileOutputStream.write(generateString().toString().getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }
}

