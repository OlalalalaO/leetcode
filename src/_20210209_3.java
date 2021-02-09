import java.util.ArrayList;
public class _20210209_3 {
/*    给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：

    目标数组 target 最初为空。
    按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
    重复上一步，直到在 nums 和 index 中都没有要读取的元素。
    请你返回目标数组。

    题目保证数字插入位置总是存在。

             

    示例 1：

    输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
    输出：[0,4,1,3,2]
    解释：
    nums       index     target
0            0        [0]
        1            1        [0,1]
        2            2        [0,1,2]
        3            2        [0,1,3,2]
        4            1        [0,4,1,3,2]
    示例 2：

    输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
    输出：[0,1,2,3,4]
    解释：
    nums       index     target
1            0        [1]
        2            1        [1,2]
        3            2        [1,2,3]
        4            3        [1,2,3,4]
        0            0        [0,1,2,3,4]

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/create-target-array-in-the-given-order
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int[] arr = createTargetArray(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1});
        for (int i : arr) {
            System.out.println(i);
        }

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i],nums[i]);

        }
        for (int i = 0; i < arr.length; i++) {
             arr[i] = arrayList.get(i);

        }


        return arr;
    }
}
