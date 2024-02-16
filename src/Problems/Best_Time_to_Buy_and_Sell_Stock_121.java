package Problems;

import java.util.Iterator;
import java.util.List;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static int maxProfit(int[] prices) {

		int lst = Integer.MAX_VALUE;
		int maxProfit = 0;
		int calPrice = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < lst) {
				lst = prices[i];
			}
			System.out.println(lst);

			calPrice = prices[i] - lst;
			System.out.println(calPrice);

			if (maxProfit < calPrice) {
				maxProfit = calPrice;
				System.out.println(maxProfit);
			}
			System.out.println();
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 1, 2 }; // 5
//		int[] prices = {983,341,957,541,470,660,118,742,334,822,165,145,730,656,567,25,684,113,351,295,468,918,587,4,399,220,11,222,777,127,135,688,267,570,342,748,382,428,340,35,896,846,376,655,147,891,198,420,729,685,989,543,285,822,254,878,380,758,490,73,870,328,234,489,990,387,688,12,795,746,275,371,321,298,186,925,845,816,775,647,379,15,602,756,619,256,106,312,965,661,973};	
		System.out.println(maxProfit(prices));

	}

}
