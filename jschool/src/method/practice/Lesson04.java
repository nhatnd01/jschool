package method.practice;

public class Lesson04 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        // 整数を表示
        System.out.println("" + num);
    }

    // ここにメソッドを記述してください
    public static int calcInt(int a, int b) {
        if (b <= 1) return 0;
        int num = 0;
        while (num == 0) {
            num = a % b;
            a /= b;
        }
        return num;
    }
}
