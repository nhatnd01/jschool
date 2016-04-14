package logic.practice;

public class Lesson08 {
    public static void main(String[] args) {
        int count = 0, num = Integer.parseInt(args[0]);
        int temp = num;
        while (temp <= 1000) {
            temp *= 2;
            if (temp >= 100 && temp <= 1000) count++;
        }
        System.out.print(count);
    }
}
