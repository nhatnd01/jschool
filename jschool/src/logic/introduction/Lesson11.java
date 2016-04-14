package logic.introduction;

public class Lesson11 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        if (num0 % 3 == 0 && num1 % 3 == 0 && num2 % 3 == 0) {
            System.out.println("全て3の倍数");
        } else if (num0 % 3 == 0 || num1 % 3 == 0 || num2 % 3 == 0) {
            System.out.println("1つは3の倍数");
        } else {
            System.out.println("その他");
        }
    }
}
