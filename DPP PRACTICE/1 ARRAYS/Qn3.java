// You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
// Return the maximum profit you can achieve from this transaction. 
// If you cannot achieve any profit, return 0

public class Qn3 {
    public static int stock(int prices[]){

        //
        int n = prices.length;
        int BuyPrice= Integer.MAX_VALUE;
        int maxprofit=0;

        // 
        for(int i = 0 ; i < n ; i++){

        if(BuyPrice<prices[i]){
            int profit = prices[i] - BuyPrice; 
            maxprofit= Math.max(profit,maxprofit);
        }
        else {
            BuyPrice=prices[i]; 
        }

    }
    return maxprofit;
}



    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(stock(prices));  
    }
}
