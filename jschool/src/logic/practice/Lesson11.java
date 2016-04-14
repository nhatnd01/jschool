package logic.practice;

public class Lesson11 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(args[0]);
        nums[1] = Integer.parseInt(args[1]);
        nums[2] = Integer.parseInt(args[2]);
        int temp;
        if (nums[0] > nums[2]) {
            temp = nums[0];
            nums[0] = nums[2];
            nums[2] = temp;
        }
        if (nums[0] > nums[1]) {
            temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        if (nums[1] > nums[2]) {
            temp = nums[1];
            nums[1] = nums[2];
            nums[2] = temp;
        }
        System.out.print (nums[0] + "\n" + nums[1] + "\n" + nums[2]);
   }
}
