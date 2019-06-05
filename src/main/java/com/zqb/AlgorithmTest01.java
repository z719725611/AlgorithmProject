package com.zqb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zengqb
 * @Description:
 * @Date: Created in 2019/6/5
 * @Modified By:
 */
public class AlgorithmTest01 {

    /**
     * Test01
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i<nums.length; i++) {
            int item = nums[i];
            if (map.containsKey(item)) {
                return new int[]{map.get(item), i};
            }
            map.put(target-item, i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        // Test01
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println((Arrays.toString(twoSum(nums, target))));

        //Test02
    }
}
