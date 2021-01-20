public class _20210120 {
    /*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

        你可以按任意顺序返回答案。

         

        示例 1：

        输入：nums = [2,7,11,15], target = 9
        输出：[0,1]
        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
        示例 2：

        输入：nums = [3,2,4], target = 6
        输出：[1,2]
        示例 3：

        输入：nums = [3,3], target = 6
        输出：[0,1]
         

        提示：

        2 <= nums.length <= 103
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        只会存在一个有效答案*/
    public static void main(String[] args) {
        int[] a = new int[]{3,3};
        System.out.println(twoSum(a,6)[0]);
        System.out.println(twoSum(a,6)[1]);

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] num = new int[2]; //定义一个元素，负责存储返回的位置
        for(int i = 0;i < nums.length;i++){ //遍历数组寻找加数
            for(int j = i+1;j < nums.length;j++){ //遍历数组寻找被加数
                if(nums[i]+nums[j] == target){ //如果符合，将加数和被加数存入数组
                    num[0] = i;
                    num[1] = j;
                }
            }
        }
        return num;
    }
}




























