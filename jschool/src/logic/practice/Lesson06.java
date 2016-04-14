package logic.practice;

public class Lesson06 {
    public static void main(String[] args) {
        int num = 0;
        for (int i=0; i<args[0].length(); i++) {
            if (args[0].charAt(i) != 'a' && args[0].charAt(i) != 'b' && args[0].charAt(i) != 'c') {
                num++;
            }
        }
        System.out.print("" + num);
    }
}
