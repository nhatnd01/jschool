package logic.introduction;

public class Lesson20 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num = 1;
        for (int i = 1; ; i++) {
            num = num0 * i;
            if (num % num1 == 0 && num % num2 == 0) break;
        }
        System.out.println(num);
    }
}
