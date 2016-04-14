package method.practice;

public class Lesson20 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(createIntArray(args[0]));
        // 整数を表示
        System.out.println("" + num);
    }

    // カンマ付き文字列をint型配列に変換するメソッド
    public static int[] createIntArray(String str) {
        String[] strs = str.split(",");
        int[] ints = new int[strs.length];
        for (int i = 0; i < strs.length; i++) ints[i] = Integer.parseInt(strs[i]);
        return ints;
    }

    // ここにメソッドを記述してください
    public static int calcInt(int[] a) {
        if (a.length < 3) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 2; i++)
            for (int j = i+1; j < a.length - 1; j++)
                for (int k = j+1; k < a.length; k++) {
                    if (max < a[i] * a[j] * a[k]) {
                        max = a[i] * a[j] * a[k];
                    }
                }
        return max;
    }
}
