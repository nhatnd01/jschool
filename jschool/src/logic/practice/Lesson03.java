package logic.practice;

public class Lesson03 {
    public static void main(String[] args) {
        if (args[0].length() > args[1].length()) {
            System.out.print(args[0]);
        } else if (args[0].length() < args[1].length()) {
                   System.out.print(args[1]);
               } else {
                     System.out.print(args[0] + "\n" + args[1]);
                 }
    }
}
