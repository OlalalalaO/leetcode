public class _20210121_3 {
    public static void main(String[] args) {
        String s = "qwerty";
        System.out.println(reverseLeftWords(s,3));
    }
    public static String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,s.length());
        s = s2+s1;

        return s;
    }
}
