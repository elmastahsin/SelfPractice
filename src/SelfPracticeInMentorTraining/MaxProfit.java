package SelfPracticeInMentorTraining;

import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array n:");
        int n = input.nextInt();

        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = input.nextInt();
        }
        System.out.println(maxProfit(price));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (isIncreasing(prices)) {
            maxProfit = prices[prices.length - 1] - prices[0];
        } else if (isDecreasing(prices)) {
            maxProfit = 0;
        } else {
            for (int i = 0; i < prices.length; i++) {

                for (int j = 1; i + j < prices.length; j++) {


                    if ((prices[i + j] - prices[i]) < 0) {
                        continue;
                    } else if (prices[i + j] - prices[i] > maxProfit) {
                        maxProfit = prices[i + j] - prices[i];
                    }
                }
            }
        }
        return maxProfit;
    }

    public static boolean isIncreasing(int[] price) {
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i] > price[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] price) {
        for (int i = 0; i < price.length - 1; i++) {
            if (price[i] < price[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7 1 5 3 6 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7 6 5 4 3 2 1] 1 2 3 4  5 6 7
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/