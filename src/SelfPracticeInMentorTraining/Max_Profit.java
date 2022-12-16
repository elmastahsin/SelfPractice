package SelfPracticeInMentorTraining;

public class Max_Profit {
    public static void main(String[] args) {

        int []prices ={9,3,8,7,5,4,3,2,13,27,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int each : prices) {
            if (each < minPrice) {
                minPrice = each;
            } else if (each- minPrice > maxProfit) {
                maxProfit = each- minPrice;
            }
        }
        return maxProfit;
    }
}
