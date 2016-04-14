package logic.introduction;

public class Lesson14 {
    public static void main(String[] args) {
        String s = args[0];
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'c') count++;
        }
        System.out.println(count);
    }
}
