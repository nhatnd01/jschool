package logic.introduction;

public class Lesson09 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        if (num1 < num0) {
            System.out.println(num0 + "/" + num1 + "=" + num0/num1 + "あまり" + num0%num1);
        } else {
            System.out.println(num1 + "/" + num0 + "=" + num1/num0 + "あまり" + num1%num0);
        }
    }
}
