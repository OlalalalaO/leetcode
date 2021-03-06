public class _20210210_1_null {
/*    给你一个以行程长度编码压缩的整数列表 nums 。

    考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。

    请你返回解压后的列表。

             

    示例：

    输入：nums = [1,2,3,4]
    输出：[2,4,4,4]
    解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
    第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
    最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
    示例 2：

    输入：nums = [1,1,2,3]
    输出：[1,3,3]
             

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] arr = decompressRLElist(new int[]{1,1,2,3});
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int[] decompressRLElist(int[] nums) {
        int sum = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            sum = sum+nums[i];
        }
        int[] arr = new int[sum];
        for (int j = 1;j<nums.length;j=j+2){
            for (int k = 0; k < nums[j-1]; k++) {
                arr[l] = nums[j];
                l++;
            }
        }
        return arr;
    }
}
