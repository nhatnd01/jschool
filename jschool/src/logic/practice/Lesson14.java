package logic.practice;

public class Lesson14 {
    public static void main(String[] args) {
        String str = args[0];
        int num = Integer.parseInt(args[1]);
        if (str.length() >= num) {
            System.out.print(str.substring(0, num));
        } else {
            for (int i=0; i<num; i++) {
                System.out.print(str.charAt(i % str.length()));
            }
        }
    }
}
