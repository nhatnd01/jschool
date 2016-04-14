package logic.introduction;

public class Lesson08 {
    public static void main(String[] args) {
        int num = args[0].indexOf(args[1]);
        String s =  args[0].substring(0,num);
        System.out.println(args[0] + "の" + args[1] + "より前の文字列は" + s + "です");
        // 指定した文字が見つからない場合は-1になります
    }
}
