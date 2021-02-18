public class _20210210_4 {
/*    平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi] 。请你计算访问所有这些点需要的 最小时间（以秒为单位）。

    你需要按照下面的规则在平面上移动：

    每一秒内，你可以：
    沿水平方向移动一个单位长度，或者
    沿竖直方向移动一个单位长度，或者
    跨过对角线移动 sqrt(2) 个单位长度（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
    必须按照数组中出现的顺序来访问这些点。
    在访问某个点时，可以经过该点后面出现的点，但经过的那些点不算作有效访问。
    输入：points = [[1,1],[3,4],[-1,0]]
    输出：7
    解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
    从 [1,1] 到 [3,4] 需要 3 秒
    从 [3,4] 到 [-1,0] 需要 4 秒
    一共需要 7 秒
    示例 2：

    输入：points = [[3,2],[-2,2]]
    输出：5

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/minimum-time-visiting-all-points
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        for (int i = 0; i < points.length-1; i++) {
            if(Math.abs(points[i+1][0] - points[i][0])>=Math.abs(points[i+1][1] - points[i][1])){
                distance += Math.abs(points[i+1][0] - points[i][0]);
            }else distance += Math.abs(points[i+1][1] - points[i][1]);
        }
        return distance;
    }
    public static int minTimeToVisitAllPointsBetter(int[][] points) {
        int distance = 0;

        for (int i = 0; i < points.length-1; i++) {
            int num1 = Math.abs(points[i+1][0] - points[i][0]);
            int num2 = Math.abs(points[i+1][1] - points[i][1]);
            distance += num1>=num2? num1:num2;
        }
        return distance;
    }

}
