package LeetCodeSolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(checkTarget(nums, target)));

    }

    public static int[] checkTarget(int[] nums, int target) {
nums= Arrays.stream(nums).sorted().toArray();
            int[] result = new int[2];
            for (int i = 0; i  < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (i != j && target == nums[i] + nums[j]) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }

}
