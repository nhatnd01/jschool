package logic.introduction;

public class Lesson07 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[1]);
        char c = args[0].charAt(num);
        System.out.println(args[0] + "のインデックスが" + num + "の文字は" + c + "です");
        // インデックスは0から始まります
    }
}
