package method.introduction;

public class Lesson03 {
    public static void main(String[] args) {
        // drawStringメソッドの呼び出し（String型の引数を複数渡します）
        drawString(args[0], args[1], args[2]);
    }

    // drawStringメソッド（String型の引数を複数受け取ります）
    public static void drawString(String str0, String str1, String str2) {
        System.out.println("1つめの引数は「" + str0 + "」です");
        System.out.println("2つめの引数は「" + str1 + "」です");
        System.out.println("3つめの引数は「" + str2 + "」です");
    }
}
