DYNAMIC PROGRAMMING:

Money Change:
Code:
import java.util.*;
class Main
{
   static int ans[]=new int[30];
    static int minCoins(int coins[], int m, int V)
    {int count=0;
        if (V == 0) return 0;
       int res = Integer.MAX_VALUE;
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= V)
         {
             int sub = minCoins(coins, m, V-coins[i]);
     
             ans[sub]=coins[i];
             if (sub != Integer.MAX_VALUE && sub + 1 < res)
                res = sub + 1;
               }
       }
       return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int coins[] =  {1,5,10};
       int m = coins.length;
       int V = sc.nextInt();
       int miniCount=minCoins(coins, m, V);
       System.out.println("Minimum coins required is "+ miniCount );
       for(int i=0;i<miniCount;i++){
   System.out.println(ans[i]);
}
}
}

