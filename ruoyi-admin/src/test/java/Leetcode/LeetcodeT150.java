package Leetcode;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class LeetcodeT150 {
    /**
     * 合并两个有序数组
     * 标签：从后向前数组遍历
     * 因为 nums1 的空间都集中在后面，所以从后向前处理排序的数据会更好，节省空间，一边遍历一边将值填充进去
     * 设置指针 len1 和 len2 分别指向 nums1 和 nums2 的有数字尾部，从尾部值开始比较遍历，同时设置指针 len 指向 nums1 的最末尾，每次遍历比较值大小之后，则进行填充
     * 当 len1<0 时遍历结束，此时 nums2 中海油数据未拷贝完全，将其直接拷贝到 nums1 的前面，最后得到结果数组
     * 时间复杂度：O(m+n)O(m+n)O(m+n)
     * <p>
     * 作者：画手大鹏
     * 链接：https://leetcode.cn/problems/merge-sorted-array/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    @Test
    public void t88() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Solution.merge(nums1, 3, nums2, 3);
    }

    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * <p>
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * <p>
     * <p>
     * <p>
     * 说明:
     * <p>
     * 为什么返回数值是整数，但输出的答案是数组呢?
     * <p>
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * <p>
     * 你可以想象内部操作如下:
     * <p>
     * // nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
     * int len = removeElement(nums, val);
     * <p>
     * // 在函数里修改输入数组对于调用者是可见的。
     * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     * }
     */
    @Test
    public void t27() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Solution.removeElement(nums1, 3);
    }

    /**
     * 287.寻找重复数
     */
    @Test
    public void t287() {
        // n=10
        int[] nums = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Solution.findDuplicate(nums));
    }
}

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i = 0; i < n; i++){
        //     nums1[m+i] = nums2[i];
        // }
        // Arrays.sort(nums1);

        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static int findDuplicate(int[] nums) {
        // 解法一
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (set.contains(Integer.valueOf(nums[i]))) {
        //         return nums[i];
        //     } else {
        //         set.add(nums[i]);
        //     }
        // }
        // return -1;

        // 解法二
        int fast = 0;
        int slow = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while (pre1 != pre2) {
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }
}

