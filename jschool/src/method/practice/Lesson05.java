package method.practice;

public class Lesson05 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        // 整数を表示
        System.out.println("" + num);
    }

    // ここにメソッドを記述してください
    public static int calcInt(int a, int b) {
        if (a <= 0 || b <= 0) return 0;
        int min = a > b ? b : a;
        int num = 1;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) num++;
        }
        return num;
    }
}
