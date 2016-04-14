package method.introduction;

public class Lesson06 {
    public static void main(String[] args) {
        // createMessageメソッドを呼び出し、String型の戻り値を受け取ります
        String str = createMessage(args[0], args[1]);
        System.out.println(str);
    }

    // createMessageメソッド（String型を返却します）
    public static String createMessage(String str1, String str2) {
        return "引数は「" + str1 + "」と「" + str2 + "」です";
    }
}
