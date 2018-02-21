package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		String[] inputValues;
		String tempName;
		int tempPrice, tempStockCount;
		
		for(int i=0;i<COUNT_GOODS;i++) {
			inputValues = scanner.nextLine().split(" ");
			
			tempName = inputValues[0];
			tempPrice = Integer.parseInt(inputValues[1]);
			tempStockCount = Integer.parseInt(inputValues[2]);
			
			goods[i] = new Goods(tempName, tempPrice, tempStockCount);
		}
		
		for(int i=0;i<COUNT_GOODS;i++) {
			goods[i].show();
		}
		
		scanner.close();
	}
}
