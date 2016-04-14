package method.introduction;

public class Lesson16 {
    public static void main(String[] args) {
        // 整数配列の受け取り
        int[] ints = createIntArray(args[0].split(","));
        // 配列の要素を表示
        for (int i = 0; i < ints.length; i++) {
            System.out.println(""+ ints[i]);
        }
    }

    // 文字列配列を受け取り、前から3つを整数にした整数配列を返却する。ただし、整数配列の初期値を「0」とし、文字列配列が3に満たない場合は初期値のままとする。
    public static int[] createIntArray(String[] orgs) {
        int[] ints = {-1, -1, -1}; // 初期値を指定して配列を作成
        for (int i = 0; i < orgs.length; i++) {
            ints[2-i] = Integer.parseInt(orgs[orgs.length - i - 1]);
            if (i == 2) break;
        }
        return ints;
    }
}
