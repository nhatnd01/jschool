package method.introduction;

public class Lesson02 {
    public static void main(String[] args) {
        // drawStringメソッドの呼び出し（String型の引数を渡します）
        drawString(args[1]);
        // drawStringメソッドの呼び出し（違う引数を渡しています）
        drawString(args[2]);
        drawString(args[0]);
        drawString(args[1]);
    }

    // drawStringメソッド（String型の引数を受け取ります）
    public static void drawString(String str) {
        System.out.println("受け取った引数は「" + str + "」です");
    }
}
