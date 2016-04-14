package method.practice;

public class Lesson06 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        // 整数を表示
        System.out.println("" + num);
    }

    // ここにメソッドを記述してください
    public static int calcInt(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 0;
        int result = 0, max;
        boolean flag = true;
        if (a > b && a > c) max = a;
        else {
           if (b > c) max = b;
           else max = c;
        }
        while (flag) {
           result += max;
           if (result % a == 0 && result % b == 0 && result % c == 0) {
               flag = false;
           }
        }
        return result;
    }
}
