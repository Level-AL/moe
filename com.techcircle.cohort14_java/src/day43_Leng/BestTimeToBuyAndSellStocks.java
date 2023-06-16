package day43_Leng;

public class BestTimeToBuyAndSellStocks {
	
	
	
	public static int bestTimeToBuyStock (int [] arr) {
		int maxProfit = 0;
		for (int i = 0; i < arr.length; i++) {
			int buyPrice = arr[i];
			for(int j = i+1; j < arr.length;j++) {
				int sellPrice = arr[j];
				if(buyPrice > sellPrice)break;
				int profit = sellPrice - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int [] arr = {100,6,3,56,20,1};
		int result =bestTimeToBuyStock(new int[] {7,1,5,3,6,4});
		
		System.out.println(result);
		
		
	}
}
