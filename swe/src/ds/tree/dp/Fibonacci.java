package ds.tree.dp;

public class Fibonacci {


    private  static  int[] dp = new int[10];

    private static void initilizeArray(int[] dp){
       for (int i=0; i<10; i++){
           dp[i] = -1;
       }
    }

    private static int fib(int n) {

        if(n == 1 || n == 2){
            return n - 1;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return (a+b);

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
        System.out.println(fib(6));
        System.out.println("Array");
        initilizeArray(dp);
        fib(6);
    }


}
