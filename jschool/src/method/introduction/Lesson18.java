package method.introduction;

public class Lesson18 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(args[0].split(","));
        // 整数を表示
        System.out.println(""+ num);
    }

    // 文字列配列を受け取り、整数に直してすべて足した値を返却する。
    public static int calcInt(String[] orgs) {
        int temp, max = Integer.MIN_VALUE;
        for (int i = 0; i < orgs.length; i++) {
            temp = Integer.parseInt(orgs[i]);
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
