package logic.introduction;

public class Lesson10 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num % 5 == 0) {
            System.out.println("5の倍数");
        } else if (num % 2 == 0) {
            System.out.println("2の倍数");
        } else if (num % 3 == 0) {
            System.out.println("3の倍数");
        } else {
            System.out.println("その他");
        }
        // 整数が等しいかどうかを調べる場合「=」ではなく「==」を使います
        // 等しくないかを調べる場合は「!=」を使います
    }
}
