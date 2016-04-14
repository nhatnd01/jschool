package method.practice;

public class Lesson15 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(createIntArray(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
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
    public static int calcInt(int[] a, int num0, int num1) {
        if (num0 < 0 || num1 > a.length-1) return 0;
        int sum = 0;
        for (int i = num0; i <= num1; i++) sum+= a[i];
        return sum;
    }
}
