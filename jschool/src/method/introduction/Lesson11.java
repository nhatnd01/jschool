package method.introduction;

public class Lesson11 {
    public static void main(String[] args) {
        // 文字列配列の受け取り
        String[] strs = createStringArray();
        // 配列の要素を表示（配列の大きさは length で取得できる）
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    // 文字列配列を作成して返却
    public static String[] createStringArray() {
        // 大きさが3の配列を作成（strs[0]からstrs[2]まで利用可能で、strs[3]を使おうとするとエラーになる）
        String[] strs = new String[4];
        strs[0] = "文字列0";
        strs[1] = "文字列1";
        strs[2] = "文字列2";
        strs[3] = "文字列3";
        // 文字列配列を返却
        return strs;
    }
}
