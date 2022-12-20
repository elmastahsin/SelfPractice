package LeetCodeSolutions;

import org.w3c.dom.ls.LSInput;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum2 {

    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int target = 6;
//        List<Integer> numbers = Arrays.stream(nums)
//                .sorted(Comparator.comparing()
//                .collect(Collectors.toList());
//        System.out.println(numbers);

        Set<Integer> numbers = new HashSet<>();
        
        System.out.println(Arrays.toString(checkTarget(nums, target)));

    }

    public static int[] checkTarget(int[] nums, int target) {


        int[] result = new int[2];
        int high = nums.length - 1;
        int low = 0;
        while (high > low) {
            if ((nums[low] + nums[high] == target)) {
                result[0] = low;
                result[1] = high;
                break;
            } else if (nums[low] + nums[high] < target) {
                low++;
            } else if (nums[low] + nums[high] > target){
                high--;
            }
        }


        return result;
    }
}

