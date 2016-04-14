package logic.introduction;

public class Lesson19 {
    public static void main(String[] args) {
        String s0 = args[0];
        String s1 = args[1];
        int len = s0.length();
        if (s1.length() < len) len = s1.length();
        int count = 0;
        int lenS0 = s0.length();
        int lenS1 = s1.length();
        for (int i = 0; i < len; i++) {
            if (s0.charAt(lenS0 - i - 1) != s1.charAt(lenS1 - i - 1)) break;
            count++;
        }
        System.out.println(count);
    }
}
