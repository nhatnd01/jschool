package method.practice;

public class Lesson09 {
    public static void main(String[] args) {
        // String型配列の受け取り
        String[] strs = createStringArray(args[0].split(","), args[1].split(","), args[2]);
        // String型配列を表示
        for (int i = 0; i < strs.length; i++) System.out.println(strs[i]);
    }

    // ここにメソッドを記述してください
    public static String[] createStringArray(String[] strs0, String[] strs1, String str) {
        for (int i = 0; i < strs0.length; i++) {
            for (int j = 0; j < strs1.length; j++) {
                if (strs0[i].equals(strs1[j])) {
                    strs0[i] = str;
                }
            }
        }
        return strs0;
    }
}
