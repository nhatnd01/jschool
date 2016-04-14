package method.practice;

public class Lesson16 {
    public static void main(String[] args) {
        // int型配列の受け取り
        int[] ints = cutIntArray(createIntArray(args[0]), Integer.parseInt(args[1]));
        // int型配列を表示
        for (int i = 0; i < ints.length; i++) System.out.println("" + ints[i]);
    }

    // カンマ付き文字列をint型配列に変換するメソッド
    public static int[] createIntArray(String str) {
        String[] strs = str.split(",");
        int[] ints = new int[strs.length];
        for (int i = 0; i < strs.length; i++) ints[i] = Integer.parseInt(strs[i]);
        return ints;
    }

    // ここにメソッドを記述してください
    public static int[] cutIntArray(int[] a, int num) {
        if (num <= 0) return a;
        int[] results = new int[num];
        if (a.length > num) {
            for (int i = 0; i < num; i++) {
                results[i] = a[i];
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                results[i] = a[i];
            }
            for (int i = a.length; i < num; i++) {
                results[i] = 0;
            }
        }
        return results;
    }
}
