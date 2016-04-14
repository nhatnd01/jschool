package logic.practice;

public class Lesson20 {
    public static void main(String[] args) {
        String str = args[0];
        int[] a = new int[str.length()];
        int num, max = Integer.MIN_VALUE;
        boolean flag;

        for (int i = 0; i < str.length(); i++) {
            a[i] = 0;
        }

        for (int i = 0 ; i < str.length(); i++) {
            flag = true;
            num = 1;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int k = i + 1; k < str.length(); k++) {
                    if (str.charAt(i) == str.charAt(k)) {
                        num++;
                    }
                }
                a[i] = num;
                if (max < num) max = num;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (a[i] == max) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
