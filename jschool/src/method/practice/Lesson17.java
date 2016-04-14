package method.practice;

public class Lesson17 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(createIntArray(args[0]), createIntArray(args[1]));
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

    public static int min(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < a.length; i++) {
            if (min > a[i]) min = a[i];
        }
        return min;
    }

    public static int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        return max;
    }

    // ここにメソッドを記述してください
    public static int calcInt(int[] a, int[] b) {
        int minA = min(a), maxA = max(a), minB = min(b), maxB = max(b);
        return (maxA - minB) > (maxB - minA) ? (maxA - minB) : (maxB - minA);
    }
}
