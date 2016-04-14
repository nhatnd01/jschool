package method.introduction;

public class Lesson17 {
    public static void main(String[] args) {
        // 文字列配列の受け取り
        String[] strs = createStringArray(args[0].split(","), args[1].split(","));
        // 配列の要素を表示
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    // 文字列配列を2つ受け取り、共通の文字列を配列にして返却する。
    public static String[] createStringArray(String[] orgs0, String[] orgs1) {
        String str = "";
        Boolean flag;
        for (int i = 0; i < orgs0.length; i++) {
            flag = true;
            for (int j = 0; j < orgs1.length; j++) {
                if (orgs1[j].equals(orgs0[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (str.length() != 0) str += ',';
                str += orgs0[i];
            }
        }
        return str.split(",");
    }
}
