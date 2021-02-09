public class _20210209_1 {
    /*
    桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。

    示例 1：

    输入：[4,2,1]

    输出：4

    解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。

    示例 2：

    输入：[2,3,10]

    输出：8

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/na-ying-bi
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        System.out.println(minCount(new int[]{4,2,1}));
    }
    /*
    思路：
        如果是奇数，先取一次取一个1，然后再两个两个取
     */
    public static int minCount(int[] coins) {
        int num = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]%2 == 1){
                num++;
                coins[i]--;
            }
            while (coins[i]!=0){
                coins[i] = coins[i] - 2;
                num++;
            }
        }
        return num;
    }
}
