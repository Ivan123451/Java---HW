package lesson2;

public class task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        StringBuilder sb = new StringBuilder();
        System.out.println();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count += 1;
                }
            else {
                sb.append(str.charAt(i)).append(count);
                count = 1;

            }

        }

        System.out.println(sb);


    }
}
