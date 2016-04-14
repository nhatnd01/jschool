package method.practice;

public class Lesson01 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = getInt(args[0], args[1], args[2]);
        // 整数を表示
        System.out.println("" + num);
    }

    public static int getInt(String str0, String str1, String str2) {
        if (str0.length() > str1.length() && str0.length() > str1.length()) {
            return str0.length();
        } else if (str1.length() > str2.length()) {
                   return str1.length();
               } else {
                     return str2.length();
                 }
    }
}
