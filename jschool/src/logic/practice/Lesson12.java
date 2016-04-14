package logic.practice;

public class Lesson12 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = Integer.parseInt(args[0]);
        nums[1] = Integer.parseInt(args[1]);
        nums[2] = Integer.parseInt(args[2]);
        int temp;
        if (Math.abs(nums[0] - 10) > Math.abs(nums[1] - 10)) {
            temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        if (Math.abs(nums[0] - 10) > Math.abs(nums[2] - 10)) {
            temp = nums[0];
            nums[0] = nums[2];
            nums[2] = temp;
        }
        if (Math.abs(nums[1] - 10) > Math.abs(nums[2] - 10)) {
            temp = nums[1];
            nums[1] = nums[2];
            nums[2] = temp;
        }
        System.out.println("" + nums[0]);
        if (Math.abs(nums[0] - 10) == Math.abs(nums[1] - 10)) System.out.println("" + nums[1]);
        if (Math.abs(nums[0] - 10) == Math.abs(nums[2] - 10)) System.out.println("" + nums[2]);
   }
}
