package logic.practice;

public class Lesson17 {
    public static void main(String[] args) {
        String str = args[0];
        int num, i=0;
        boolean flag;
        while (i < str.length()) {
            num = 1;
            flag = true;
            while (flag) {
                if ((i+num) < str.length()) {
                    if ((str.charAt(i) == str.charAt(i + num)) && (num < 9)) {
                         num++;
                    } else {
                        flag = false;
                        System.out.print(str.charAt(i) + "" + num);
                        i += num;
                    }
                } else {
                    flag = false;
                    System.out.print(str.charAt(i) + "" + num);
                    i += num;
                }
            }
        }
    }
}
