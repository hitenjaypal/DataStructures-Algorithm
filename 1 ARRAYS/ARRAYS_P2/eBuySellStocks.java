// Problem to solve Best Time for Buy & Sell Stock 

import java.util.*;

public class eBuySellStocks{
    public static int Stock(int prices[]){
        //variables Intialized
        int n = prices.length;
        int BuyPrice = Integer.MAX_VALUE;
        int maxprofit =0;

        // logic 
        for(int i=0;i<n;i++){
            if(BuyPrice<prices[i]){ //Sell // Profit jb buy kiya hua price aaj ke price se km ho eg phele 12 mai buy kiya aaj uska rate 300 hai toh // Profit Karo
            
                int profit = prices[i] - BuyPrice;        // Todays Profit
                maxprofit= Math.max(maxprofit, profit);   // Maximum of Current and Previous Day's Profit
            }else{                                        //  if the stock price is decreasing then update the buyprice as current price
                BuyPrice=prices[i];                       // If it is not possible to Buy on that day then keep.
            }


        }
        return  maxprofit;
    }






    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit You Can Get From This Stock Prices is:" + Stock(prices));
    }


}
