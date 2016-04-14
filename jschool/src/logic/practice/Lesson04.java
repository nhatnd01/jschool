package logic.practice;

public class Lesson04 {
    public static void main(String[] args) {
        if (args[0].equals(args[1]) && args[0].equals(args[2])) {
            System.out.print("全部同じ文字列");
        } else if (args[0].equals(args[1]) || args[0].equals(args[2]) || args[1].equals(args[2])) {
                   System.out.print("2つ同じ文字列");
               } else {
                     System.out.print("その他");
                 }
    }
}
