package method.practice;

public class Lesson10 {
    public static void main(String[] args) {
        // String型配列の受け取り
        boolean[] checks = createStringArray(args[0].split(","));
        String[] strs = args[0].split(",");
        // String型配列を表示
        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) System.out.println(strs[i]);
        }
    }

    // ここにメソッドを記述してください
    public static boolean[] createStringArray(String[] s) {
        boolean[] checks = new boolean[s.length];
        for (int i = 0; i < checks.length; i++) checks[i] = true;
        for (int i = 1; i < s.length; i++) {
            for (int j = 0; j < i; j++ ) {
                if (s[i].equals(s[j])) {
                    checks[i] = false;
                    break;
                }
            }
        }
        return checks;
    }
}
