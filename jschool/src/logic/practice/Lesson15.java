package logic.practice;

public class Lesson15 {
    public static void main(String[] args) {
        String temp = "", str = args[0];
        int j, i = 3;
        while (!temp.equals(str)) {
           temp = "";
           for (j = i; j < i + str.length(); j++) {
               temp += str.charAt(j % str.length());
           }
           i += 3;
           System.out.println(temp);
        }
    }
}
