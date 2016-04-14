package method.practice;

public class Lesson07 {
    public static void main(String[] args) {
        // int型配列の受け取り
        int[] ints = createIntArray(args[0].split(","));
        // int型配列を表示
        for (int i = 0; i < ints.length; i++) System.out.println("" + ints[i]);
    }

    // ここにメソッドを記述してください
    public static int[] createIntArray(String[] s) {
        int[] a = new int[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = s[i].length();
        }
        return a;
    }
}
