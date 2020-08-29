import java.util.*;

public class Stock_Buy_And_Sell {
	public static void main(String[] args) {
		int[] price = new int[] {7, 1, 5, 3, 6, 4};

		int minPrice = Integer.MAX_VALUE;
		int buy = 0, sell = 0, maxProfit = 0;

		for (int i = 0; i < price.length; i++) {
			if (price[i]  < minPrice) {
				minPrice = price[i];
				buy = price[i];
			} else if (price[i] - minPrice > maxProfit) {
				maxProfit = price[i] - minPrice;
				sell = price[i];
			}
		}

		System.out.println("Buy at " + buy + " & Sell at " + sell + " will get maximum profit: " + maxProfit);

	}
}