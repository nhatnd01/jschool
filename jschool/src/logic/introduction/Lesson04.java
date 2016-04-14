package logic.introduction;

public class Lesson04 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num3 = num0 + num1 + num2;
        int num4 = num0 - num1 - num2;
        System.out.println(num0 + "+" + num1 + "+" + num2 + "=" + num3);
        System.out.println(num0 + "-" + num1 + "-" + num2 + "=" + num4);
    }
}
