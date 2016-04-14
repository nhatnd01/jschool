package method.introduction;

public class Lesson09 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // calcIntメソッドの呼び出し
        int ret = calcInt(a, b);
        System.out.println("" + ret);
    }

    // int型の引数a, bを受け取り、aをbで割り切れる回数を返却する。ただし bが「0」以下 のときは「0」を返却する。
    public static int calcInt(int a, int b) {
        if (b <= 0) return a;
        int temp = 1;
        for (int i=0; i < b; i++) {
            temp *= a;
        }
        return temp;
    }
}
