package method.practice;

public class Lesson11 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = countString(args[0].split(","), args[1].split(","), args[2].split(","));
        // 整数を表示
        System.out.println("" + num);
    }

    public static int countString(String[] strs0, String[] strs1, String[] strs2) {
        int num = 0;
        for (int i = 0; i < strs0.length; i++) {
            if (!isDuplicated (strs0, i)) {
                if (isContained(strs1, strs0[i]) && isContained(strs2, strs0[i])) num++;
            }
        }
        return num;
    }

    public static boolean isContained(String[] strs, String str) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) return true;
        }
        return false;
    }

    public static boolean isDuplicated(String[] strs, int num) {
        for (int i = 0; i < num; i++) {
            if (strs[i].equals(strs[num])) return true;
        }
        return false;
    }
}
