import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;

public class _20210121_4 {
    public static void main(String[] args) {
    }
    public static int numIdenticalPairs(int[] nums) {
        int num = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j< nums.length;j++){
                if(nums[i] == nums[j] && i!=j)num++;
            }
        }
        return num/2;
    }
}
