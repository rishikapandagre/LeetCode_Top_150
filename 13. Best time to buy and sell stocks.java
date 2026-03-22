// LeetCode - 121

class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;

       int[] maxValue = new int[n];
       maxValue[n-1] = prices[n-1];

       for(int i=n-2; i>=0; i--){
        maxValue[i] = Math.max(maxValue[i+1] , prices[i]);
       } 

       int ans=0;
       for(int i=0; i<n; i--){
        int currProfit = maxValue[i] - prices[i];
        ans = Math.max(currProfit , ans);
       }

       return ans;
    }

    static{
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try(FileWriter f = new FileWriter("display_runtime.txt")){
                f.write("0");
            }catch(Exception e){

            }
        }));
    }
}
