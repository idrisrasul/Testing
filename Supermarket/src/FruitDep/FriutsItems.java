package FruitDep;

import java.util.Scanner;

import MilkDep.Milkproduct;

public class FriutsItems extends Milkproduct{
		public int apple() {
			Scanner sc=new Scanner(System.in);
			int apple=sc.nextInt();
			System.out.println("apple price is :"+apple);
			int appleqty=sc.nextInt();
			System.out.println("apple QTY is :"+appleqty);
			int total_price=apple*appleqty;
			System.out.println("Total Apple price :"+total_price);
			return total_price;
		}
}
