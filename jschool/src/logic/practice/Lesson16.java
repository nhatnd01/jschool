package logic.practice;

public class Lesson16 {
    public static void main(String[] args) {
        String str = args[0];
        int num;
        for (int i = 0; i < str.length(); i+=2) {
            num = Integer.parseInt(str.substring(i+1, i+2));
            for (int j = 0; j < num; j++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
