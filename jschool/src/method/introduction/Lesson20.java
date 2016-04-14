package method.introduction;

public class Lesson20 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = getInt(createIntArray(args[0]), Integer.parseInt(args[1]));
        // 整数を表示
        System.out.println(""+ num);
    }

    // カンマ付き文字列をint型配列に変換するメソッド
    public static int[] createIntArray(String str) {
        String[] strs = str.split(",");
        int[] ints = new int[strs.length];
        for (int i = 0; i < strs.length; i++) ints[i] = Integer.parseInt(strs[i]);
        return ints;
    }

    // int型配列の引数orgsとint型の引数numを受け取り、numをインデックスとしてorgsの要素を返却する。だたし、numがインデックスとして不適切な場合は「0」を返却する。
    public static int getInt(int[] orgs, int num) {
        int max = num, sum = 0;
        if (num < 0) return 0;
        else if (num > orgs.length) {
            max = orgs.length;
        }
        for (int i = 0; i < max; i++) {
            sum += orgs[i];
        }
        return sum;
    }
}
