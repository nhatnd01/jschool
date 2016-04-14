package method.introduction;

public class Lesson07 {
    public static void main(String[] args) {
        // addIntメソッドを呼び出し、int型の戻り値を受け取ります
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num  = addInt(num0, num1, num2);
        System.out.println("引数の合計は「" + num + "」です");
    }

    // addIntメソッド（int型を返却します）
    public static int addInt(int num0, int num1, int num2) {
        int num = num0 + num1 + num2;
        return num;
    }
}
