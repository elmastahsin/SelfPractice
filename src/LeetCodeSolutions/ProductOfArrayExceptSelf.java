package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,0,0};

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }


    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}

  /*      int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < result.length; i++) {
            product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }

        return result;


    }*/

/*
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i-1] *= right;
            right *= nums[i];
        }
        return result;
    }
}*/