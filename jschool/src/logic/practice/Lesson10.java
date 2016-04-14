package logic.practice;

public class Lesson10 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int max = num0 > num1 ? num0 : num1;
        for (int i=1; i<=max; i++) {
            if (num0 % i == 0 && num1 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
