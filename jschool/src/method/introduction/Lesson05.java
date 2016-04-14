package method.introduction;

public class Lesson05 {
    public static void main(String[] args) {
        // drawCalculationメソッドの呼び出し（String型とint型の引数を渡します）
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        drawCalculation(args[0], num1 , num2);
    }

    // drawCalculationメソッド（String型とint型の引数を受け取ります）
    public static void drawCalculation(String str, int num1, int num2) {
        System.out.println(num1 + "円の" + str + "を" + num2 + "個買うと" + num1*num2 + "円です");
    }
}
