import java.util.Arrays;

public class _20210210_3 {
/*    给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。

    换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。

    以数组形式返回答案。

             

    示例 1：

    输入：nums = [8,1,2,2,3]
    输出：[4,0,1,1,3]
    解释：
    对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
    对于 nums[1]=1 不存在比它小的数字。
    对于 nums[2]=2 存在一个比它小的数字：（1）。
    对于 nums[3]=2 存在一个比它小的数字：（1）。
    对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
    示例 2：

    输入：nums = [6,5,4,8]
    输出：[2,1,0,3]
    示例 3：

    输入：nums = [7,7,7,7]
    输出：[0,0,0,0]

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] arr = smallerNumbersThanCurrent(new int[]{6,5,4,8});
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arrNew = new int[nums.length];
        arrNew[0] = 0;
        int[] arrIndex = new int[nums.length];
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = i;

        }

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int buffer = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = buffer;
                    buffer = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buffer;
                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums [i-1]){
                arrNew[i] = arrNew[i-1];
            }else {
                arrNew[i]  = i;
            }

        }
        for (int i = 0; i < arrIndex.length; i++) {
            arrIndex[arr[i]] = arrNew[i];

        }

        return arrIndex;
    }
}