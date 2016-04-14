package logic.introduction;

public class Lesson03 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        String str = args[0] + args[1] + args[2];
        int num = num0 + num1 + num2;
        System.out.println("引数を文字列として足すと" + str);
        System.out.println("引数を整数として足すと" + num);
    }
}
