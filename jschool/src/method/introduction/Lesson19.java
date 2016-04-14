package method.introduction;

public class Lesson19 {
    public static void main(String[] args) {
        // String型配列の受け取り
        String[] strs = createStringArray(args[0].split(","), Integer.parseInt(args[1]));
        // 配列の要素を表示
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    // String型配列の引数orgsとint型の引数numを受け取り、numの大きさだけorgsを先頭から切り出して返却する。ただし、numが0以下もしくはorgsの大きさより大きい場合はorgsをそのまま返却する。
    public static String[] createStringArray(String[] orgs, int num) {
        if (num <= 0) return orgs;
        int orgsLength = orgs.length;
        String[] strs = new String[num];
        for (int i = 0; i < num; i++) {
            strs[i] = orgs[i % orgsLength];
        }
        return strs;
    }
}
