package logic.introduction;

public class Lesson18 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        while (num <= 100) {
            num *= 3;
        }
        System.out.println(num/3);
    }
}
