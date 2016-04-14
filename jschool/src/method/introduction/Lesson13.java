package method.introduction;

public class Lesson13 {
    public static void main(String[] args) {
        // 文字列配列の受け取り
        String[] strs = createStringArray(args[0]);
        // 配列の要素を表示（配列の大きさは length で取得できる）
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    // 文字列配列を作成して返却
    public static String[] createStringArray(String str) {
        // 文字列をカンマで区切って配列に直す
        String[] strs = str.split(";");
        // 文字列配列を返却
        return strs;
    }
}
