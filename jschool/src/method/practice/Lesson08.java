package method.practice;

public class Lesson08 {
    public static void main(String[] args) {
        // String型配列の受け取り
        String[] strs = createStringArray(args[0].split(","), Integer.parseInt(args[1]));
        // String型配列を表示
        for (int i = 0; i < strs.length; i++) System.out.println(strs[i]);
    }

    // ここにメソッドを記述してください
    public static String[] createStringArray(String[] s, int num) {
        if (num <= 0) return s;
        String[] results = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() <= num) results[i] = s[i];
            else results[i] = s[i].substring(0, num);
        }
        return results;
    }
}
