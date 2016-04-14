package logic.introduction;

public class Lesson12 {
    public static void main(String[] args) {
        if (args[0].equals(args[1])) {
            System.out.println("同じ文字列");
        } else if (args[0].length() == args[1].length()){
            System.out.println("文字数が一致");
        } else {
            System.out.println("その他");
        }
        // 文字列の比較を行う場合は「==」ではなく「equals」を使います
    }
}
