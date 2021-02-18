import java.util.Arrays;

public class _20210210_2 {
/*    给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。

    数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。

             

    示例 1：

    输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
    输出：true
    解释：
    word1 表示的字符串为 "ab" + "c" -> "abc"
    word2 表示的字符串为 "a" + "bc" -> "abc"
    两个字符串相同，返回 true
    示例 2：

    输入：word1 = ["a", "cb"], word2 = ["ab", "c"]
    输出：false
    示例 3：

    输入：word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
    输出：true

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"},new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqualBetter(new String[]{"ab", "c"},new String[]{"a", "bc"}));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = null;
        String w2 = null;
        for (String s : word1) {
            w1 = w1+s;
        }
        for (String s : word2) {
            w2 = w2+s;
        }
        return w1.equals(w2);
    }
    public static boolean arrayStringsAreEqualBetter(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
