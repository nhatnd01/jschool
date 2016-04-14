package logic.practice;

public class Lesson18 {
    public static void main(String[] args) {
        String str = args[0];
        boolean flag;
        for (int i = 0 ; i < str.length(); i++) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(str.charAt(i));
        }
    }
}
