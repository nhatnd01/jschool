package logic.introduction;

public class Lesson06 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[1]);
        String str1 = args[0].substring(0, num);
        String str2 = args[0].substring(num);
        System.out.println("前半は" + str1 + "です");
        System.out.println("後半は" + str2 + "です");
    }
}
