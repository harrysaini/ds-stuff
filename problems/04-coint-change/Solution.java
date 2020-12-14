
class Solution
{

    public long ways(int amount, int coins[], long memo[][], int start) {
        if(amount == 0) {
            return 1;
        }

        if(amount < 0) {
            return 0;
        }

        if(memo[amount][start] != -1) {
            return memo[amount][start];
        }

        long ways = 0;
        for(int i = start ; i < coins.length ; i++) {
            int coin = coins[i];
            long res = ways(amount - coin, coins, memo, i + 1);

            if(res > 0){
                 ways += res;
            }


        }

        memo[amount][start] = ways;
        return ways;
    }

    public long count(int S[], int m, int n)
    {
        //code here.
        long[][] memo = new long[n+1][m];

        for(int i= 0; i<=n ; i++) {
            for(int j = 0; j < m ; j++) {
                memo[i][j] = -1;
            }
        }

        return ways(n, S, memo, 0);
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[] s = {1, 2, 3};

        Solution sol = new Solution();

        System.out.println(sol.count(s, m, n));
    }
}
