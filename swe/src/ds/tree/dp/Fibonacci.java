package ds.tree.dp;

public class Fibonacci {


    private  static  int[] dp = new int[10];

    private static void initilizeArray(int[] dp){
       for (int i=0; i<10; i++){
           dp[i] = -1;
       }
    }

    private static int fib(int n) {

        System.out.println("Fib function called with "+ n);

        if(n == 1 || n == 2){
           return n-1;
        }
        if(dp[n-1] == -1){
           dp[n-1] = fib(n-1);
        }
        if(dp[n-2] == -1){
            dp[n-2] = fib(n-2);
        }
        dp[n] = dp[n-1] + dp[n-2];
        return dp[n];

    }
    public static void main(String[] args) {

        int[] fib = new int[7];
        fib[1] = 0;
        fib[2] = 1;

        //with iterative dynamic programming
        for(int i = 3; i <= 6; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        for(int i = 1; i <= 6; i++){
            System.out.println(fib[i]);
        }
        System.out.println("Output for recurrsive approach");
        initilizeArray(dp);
        for(int i=0; i<=6; i++){
            System.out.println(dp[i]);
        }
        fib(6);
        for(int i=1; i<=6; i++){
            System.out.println(dp[i]);
        }
    }


}
