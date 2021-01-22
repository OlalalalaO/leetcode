public class _20210121_5 {
    public static void main(String[] args) {
        String s = "z";
        String s1 = "ZZ";
        System.out.println(numJewelsInStones(s,s1));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsArrary = jewels.toCharArray();
        int sum = 0;
        char[] stonesArray = stones.toCharArray();
        for(int i = 0;i<jewels.length();i++){
            for(int j = 0;j<stonesArray.length;j++){
                if(jewelsArrary[i] == stonesArray[j]) sum++;
            }
        }
        return sum;
    }
}
