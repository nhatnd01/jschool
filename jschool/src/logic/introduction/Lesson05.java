package logic.introduction;

public class Lesson05 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num3 = num0 * num1;
        int num4 = num3 * num2;
        int num5 = num3 / num2;
        int num6 = num3 % num2;
        System.out.println(num0 + "*" + num1 + "=" + num3);
        System.out.println(num3 + "*" + num2 + "=" + num4);
        System.out.println(num3 + "/" + num2 + "=" + num5 + "あまり" + num6);
    }
}
