package logic.introduction;

public class Lesson13 {
    public static void main(String[] args) {
        String s = args[0];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(len-i-1);
            System.out.println(c);
        }
    }
}
