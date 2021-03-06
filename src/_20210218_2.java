public class _20210218_2 {
    private static int count;
    /*    给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。

                 

        示例 1：

        输入：num = 14
        输出：6
        解释：
        步骤 1) 14 是偶数，除以 2 得到 7 。
        步骤 2） 7 是奇数，减 1 得到 6 。
        步骤 3） 6 是偶数，除以 2 得到 3 。
        步骤 4） 3 是奇数，减 1 得到 2 。
        步骤 5） 2 是偶数，除以 2 得到 1 。
        步骤 6） 1 是奇数，减 1 得到 0 。
        示例 2：

        输入：num = 8
        输出：4
        解释：
        步骤 1） 8 是偶数，除以 2 得到 4 。
        步骤 2） 4 是偶数，除以 2 得到 2 。
        步骤 3） 2 是偶数，除以 2 得到 1 。
        步骤 4） 1 是奇数，减 1 得到 0 。
        示例 3：

        输入：num = 123
        输出：12

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps (int num) {

        if(num%2 == 0&&num!=0){
            count++;
            numberOfSteps(num/2);
        }else if(num%2 == 1&&num!=0){
            count++;
            numberOfSteps(num-1);
        }
        return count;
    }
}
