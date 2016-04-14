package logic.practice;

public class Lesson05 {
    public static void main(String[] args) {
        String str = args[0];
        for (int i=0; i<str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
    }
}
