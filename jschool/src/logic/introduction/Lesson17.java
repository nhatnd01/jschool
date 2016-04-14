package logic.introduction;

public class Lesson17 {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = "";
        while (s1.length() > 3) {
            s2 = ',' + s1.substring(s1.length() - 3) + s2;
            s1 = s1.substring(0, s1.length() - 3);
        }
        s2 = s1 + s2;
        System.out.println(s2);
    }
}
