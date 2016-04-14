package logic.introduction;

public class Lesson16 {
    public static void main(String[] args) {
        String s = args[0];
        int num = Integer.parseInt(args[1]);
        while (s.length() < num) {
            s = '0' + s;
        }
        System.out.println(s);
    }
}
