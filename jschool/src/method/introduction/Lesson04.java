package method.introduction;

public class Lesson04 {
    public static void main(String[] args) {
        // drawCalculationメソッドの呼び出し（int型の引数を複数渡します）
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        drawCalculation(num0, num1, num2);
    }

    // drawCalculationメソッド（int型の引数を複数受け取ります）
    public static void drawCalculation(int num0, int num1, int num2) {
        int num3 = num0 + num1 + num2;
        System.out.println(num0 + "+" + num1 + "+" + num2 +"=" + num3);
    }
}
