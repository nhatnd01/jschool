package logic.practice;

public class Lesson13 {
    public static void main(String[] args) {
        String[] str = args[0].split(",", -1);
        for (int i = 0; i<str.length; i++) {
            System.out.print("[" + str[i] + "]");
        }
    }
}
