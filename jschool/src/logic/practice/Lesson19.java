package logic.practice;

public class Lesson19 {
    public static void main(String[] args) {
        String str = args[0], str1 = args[1];
        boolean flag;
        int num = 0;
        for (int i = 0 ; i < str.length(); i++) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int k = 0; k < str1.length(); k++) {
                    if (str.charAt(i) == str1.charAt(k)) {
                        num++;
                        break;
                    }
                }
            }
        }
        System.out.print("" + num);
    }
}
