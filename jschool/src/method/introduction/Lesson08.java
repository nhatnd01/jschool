package method.introduction;

public class Lesson08 {
    public static void main(String[] args) {
        // deductIntメソッドを呼び出し、int型の戻り値を受け取ります
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int max, min;

        if (num0>num1 && num0>num2) {
            max = num0;
        } else {
            max = num1>num2?num1:num2;
        }

        if (num0<num1 && num0<num2) {
            min = num0;
        } else {
            min = num1>num2?num2:num1;
        }

        int num  = deductInt(max, min);
        System.out.println("差分は「" + num + "」です");
    }

    // deductIntメソッド
    public static int deductInt(int num0, int num1) {
        int num = num0 - num1;
        return num;
    }
}
