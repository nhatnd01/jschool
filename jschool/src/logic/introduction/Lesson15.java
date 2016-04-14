package logic.introduction;

public class Lesson15 {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int sum = 0;
        if (num0 < num1){
        for (int i = num0; i <= num1; i++) {
            sum += i;
        }
        } else {
        for (int i = num1; i <= num0; i++) {
            sum += i;
        }
        }
        System.out.println(sum);
    }
}
