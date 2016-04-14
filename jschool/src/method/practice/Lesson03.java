package method.practice;

public class Lesson03 {
    public static void main(String[] args) {
        // 文字列の受け取り
        String str = cutString(args[0], Integer.parseInt(args[1]));
        // 文字列を表示
        System.out.println(str);
    }

    public static String cutString(String str, int num) {
        if (num <= 0) return str;
        if (str.length() >= num) return str.substring(0, num);
        else {
            String result = str;
            for (int i = 0; i < num - str.length(); i++) {
                result = "-" + result;
            }
            return result;
        }
    }
}
