package logic.practice;

public class Lesson09 {
    public static void main(String[] args) {
        int count = 0 , num = Integer.parseInt(args[0]);
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }
        System.out.print("" + count);
    }
}
