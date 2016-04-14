package method.introduction;

public class Lesson15 {
    public static void main(String[] args) {
        // 文字列配列の受け取り
        String[] strs = createStringArray(args[0].split(","));
        // 配列の要素を表示
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    // 文字列配列を受け取り、順番を逆にした文字列配列を返却する。
    public static String[] createStringArray(String[] orgs) {
        String[] strs = new String[orgs.length];
        for (int i = 0; i < orgs.length - 1; i++) {
            strs[i] = orgs[i+1];
        }
        strs[orgs.length - 1] = orgs[0];
        return strs;
    }
}
