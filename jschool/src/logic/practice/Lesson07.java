package logic.practice;

public class Lesson07 {
    public static void main(String[] args) {
        String result = "";
        if (args[0].length() <= 2) {
            result = args[0];
        } else {
            for (int i = 0; i < args[0].length(); i+=2) {
                if (result.length() > 0) result += '-';
                if (i != args[0].length()-1) result += args[0].substring(i, i+2);
                else {
                    result += args[0].substring(i, i+1);
                }
            }
        }
        System.out.print (result);
    }
}
