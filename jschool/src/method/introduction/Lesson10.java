package method.introduction;

public class Lesson10 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // calcIntメソッドの呼び出し
        int ret = calcInt(a, b, c);
        System.out.println("" + ret);
    }

    // int型の引数a, bを受け取り、aを「2」でb回割った値を返却する。ただしbが「0」以下の場合、およびb回割れない場合は「0」を返却する。
    public static int calcInt(int a, int b, int c) {
        if (b <= 0) return a;
        int ret = a;
        for (int i = 0; i < b; i++) {
            ret *= 3;
        }
        if (ret < c) return ret;
        else {
            return c;
        }
    }
}
