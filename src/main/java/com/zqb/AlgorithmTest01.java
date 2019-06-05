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

    /**
     * Test02
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     *
     * 示例 1:
     *
     * 输入: 123
     * 输出: 321
     *  示例 2:
     *
     * 输入: -123
     * 输出: -321
     * 示例 3:
     *
     * 输入: 120
     * 输出: 21
     * 注意:
     *
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int y;
        try {
            if (x>=0) {
                StringBuilder xBuilder = new StringBuilder(x+"");
                y = Integer.valueOf(String.valueOf(xBuilder.reverse()));
            } else {
                StringBuilder xBuilder = new StringBuilder((-1)*x+"");
                y = Integer.valueOf(String.valueOf(xBuilder.reverse())) * (-1);
            }
        }catch (NumberFormatException e) {
            y = 0;
        }
        return y;
    }

    /**
     * Test03
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     *
     * 示例 1:
     *
     * 给定数组 nums = [1,1,2],
     *
     * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     * 示例 2:
     *
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     *
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     * @param nums
     */
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i = 0;
        for (int j = 1; j < length; j++) {
            if (nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        // Test01
        int[] nums01 = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums01, target)));

        //Test02
        System.out.println(reverse(12340));

        //Test03
        int[] nums03 = new int[]{0, 0, 1, 2, 2, 2, 3, 3, 4, 5};
        int afterRemoveLength = removeDuplicates(nums03);
        System.out.println(afterRemoveLength);
        nums03 = Arrays.copyOfRange(nums03, 0, afterRemoveLength);
        System.out.println(Arrays.toString(nums03));
    }
}
