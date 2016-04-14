package method.practice;

public class Lesson02 {
    public static void main(String[] args) {
        // 文字列の受け取り
        String str = cutString(args[0]);
        // 文字列を表示
        System.out.println(str);
    }

    // ここにメソッドを記述してください
    public static String cutString(String str) {
        if (str.length() < 5) return str;
        return str.substring(0,3) + "...";
    }
}
