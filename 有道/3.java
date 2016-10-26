简单背包，重量m，n个物品，求重量最大值。
http://www.layz.net/LAOJ/suanfa/s7-2.html

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();      //限定载重；
        String str = in.nextLine();
        String[] strs = in.nextLine().split(" ");
        int[] items = new int[m+1]; //物品重量
        boolean[] dp = new boolean[m+1];

        for(int i = 1;i<=strs.length;i++){
            items[i] = Integer.parseInt(strs[i-1]);
        }

        dp[0]=true;

        for (int i = 1; i <= m; i++){
            for (int j = m; j >= items[i]; j --) {
                if (dp[j - items[i]] == true) {
                    dp[j] = true;
                }
            }
        }

        for (int i = m; i >=0; i --){
            if (dp[i]){
                System.out.print(i);
                break;
            }
        }
    }
}
