public class _20210121_2 {
    public static void main(String[] args) {
        int client[][] = {{1,2,3}, {1,1,2},{4,2,6},{8,5,3}};
        System.out.println(maximumWealth(client));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxMoney = 0;
        for(int client = 0;client<accounts.length;client++){
            int clientMoney = 0;
            for(int company = 0;company<accounts[0].length;company++){
                clientMoney += accounts[client][company];
            }
            if (clientMoney>maxMoney) maxMoney = clientMoney;
        }
        return maxMoney;
    }
}
