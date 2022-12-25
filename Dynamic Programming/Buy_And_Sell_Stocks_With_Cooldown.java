public class Buy_And_Sell_Stocks_With_Cooldown {
    public static int maxProfit(int prices[]){
        int len=prices.length;
        if(len==0)return 0;
        int sell=0, buy=-prices[0], cool=0, min_buy=buy, tmp=sell;
        for(int i=1;i<len;i++){
            sell=min_buy+prices[i];// sell
            buy=cool-prices[i];// buy
            cool=Math.max(cool,tmp);
            tmp=sell;
            min_buy=Math.max(min_buy, buy);
        }
        return Math.max(sell,cool);
    }
    public static void main(String[] args) {
        int prices[]={1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }
}


// The function takes an array of integers as an input, representing the prices of the stock on each day. It returns an integer, representing the maximum profit that can be made.

// The function has four variables:

// sell: represents the maximum profit that can be made after selling the stock on the current day
// buy: represents the maximum profit that can be made after buying the stock on the current day
// cool: represents the maximum profit that can be made after taking no action (neither buying nor selling) on the current day
// min_buy: represents the minimum value of the buy variable seen so far
// The function iterates through the array of prices, starting from the second element (since the first element has no previous element to compare with). On each iteration, it calculates the values of sell, buy, and cool for the current day. It then updates the tmp variable with the value of sell, and updates the min_buy variable with the maximum of the current value of buy and the previous value of min_buy.

// After the loop finishes, the function returns the maximum of sell and cool, which represents the maximum profit that can be made either by selling on the last day or by taking no action on the last day.

// This solution is based on the idea of keeping track of the maximum profit that can be made at each stage in the process: after buying, after selling, and after taking no action. It uses dynamic programming to efficiently compute these values in a single pass through the array of prices.



// The function first initializes four variables:

// sell: This variable will store the maximum profit that can be made after selling the stock on the current day. It is initialized to 0, since we have not yet made any transactions.
// buy: This variable will store the maximum profit that can be made after buying the stock on the current day. It is initialized to -prices[0], since the initial cost of buying the stock is equal to its price on the first day.
// cool: This variable will store the maximum profit that can be made after taking no action (neither buying nor selling) on the current day. It is initialized to 0, since we have not yet made any transactions.
// min_buy: This variable will store the minimum value of the buy variable seen so far. It is initialized to the initial value of buy, which is -prices[0].
// The function then checks if the length of the input array is 0. If it is, it returns 0, since there are no prices to consider and no profit can be made.

// Next, the function enters a loop that iterates through the array of prices, starting from the second element (since the first element has already been considered). On each iteration, the following actions are performed:

// The value of sell is updated to the maximum of the current value of sell and the minimum value of buy seen so far plus the price on the current day. This represents the maximum profit that can be made by selling the stock on the current day, either by selling the stock that was just bought or by selling the stock that was previously bought on a different day.
// The value of buy is updated to the maximum of the current value of cool and the negative of the price on the current day. This represents the maximum profit that can be made by buying the stock on the current day, either by not doing anything and keeping the cash or by selling the stock that was previously bought on a different day and using the proceeds to buy the stock again.
// The value of cool is updated to the maximum of the current value of cool and the previous value of sell. This represents the maximum profit that can be made by taking no action on the current day, either by not doing anything and keeping the cash or by selling the stock that was previously bought on a different day.
// The value of tmp is updated with the value of sell. This is a temporary variable that will be used to update the value of cool on the next iteration.
// The value of min_buy is updated with the maximum of the current value of buy and the previous value of min_buy. This represents the minimum value of buy seen so far, which is used to calculate the value of sell on the next iteration.
// After the loop finishes, the function returns the maximum of sell and cool, which represents the maximum profit that can be made either by selling on the last day or by taking no action on the last day.