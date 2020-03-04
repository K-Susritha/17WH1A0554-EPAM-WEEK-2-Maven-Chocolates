
package com.epam.task2;

import java.util.Scanner;

public class Gifts {
	public static void main(String args[]) {
		int weight,quantity,total_weight=0,total_sweets=0,total_candies=0;
		int candies; 
		Scanner sc = new Scanner(System.in);
		Boolean n = true;
		Sweets collect_sweets = null;

		System.out.println("select the choice of sweets you want");
		while(n) {
			System.out.println("1.DarkChocolate");
			System.out.println("2.Kitkat");
			System.out.println("3.Perk");
			System.out.println("5.Snickers");
			int choice = sc.next().charAt(0);
			char nextchoice;
			try {
				switch(choice) {
				case '1':
					System.out.println("Enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Enter the weight");
					weight = sc.nextInt();
					collect_sweets = new DarkChocolate();
					total_sweets =collect_sweets.Sweets_weight(quantity, weight);
					total_weight += total_sweets;
					System.out.println("Enter the candies");
					candies = sc.nextInt();
					System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
					System.out.println("The total weight of the gift:" +total_weight);
					total_candies += candies;
					System.out.println("The total weight of gift is:");
					System.out.println(total_candies + total_sweets);

					break;
				case '2':
					System.out.println("Enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Enter the weight");
					weight = sc.nextInt();
					collect_sweets =  new KitKat();
					total_weight += total_sweets;
					System.out.println("Enter the candies");
					candies = sc.nextInt();
					System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
					System.out.println("The total weight of the gift:" +total_weight);
					total_candies += candies;
					System.out.println("The total weight of gift is:");
					System.out.println(total_candies + total_sweets);
					break;
				case '3':
					System.out.println("Enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Enter the weight");
					weight = sc.nextInt();
					collect_sweets =  new Perk();
					total_sweets =collect_sweets.Sweets_weight(quantity, weight);
					total_weight += total_sweets;
					System.out.println("Enter the candies");
					candies = sc.nextInt();
					System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
					System.out.println("The total weight of the gift:" +total_weight);
					total_candies += candies;
					System.out.println("The total weight of gift is:");
					System.out.println(total_candies + total_sweets);
					break;
				case '4':
					System.out.println("Enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Enter the weight");
					weight = sc.nextInt();
					collect_sweets = new Snickers();
					total_sweets =collect_sweets.Sweets_weight(quantity, weight);
					total_weight += total_sweets;
					System.out.println("Enter the candies");
					candies = sc.nextInt();
					System.out.println("The total weight of the sweet is:" + total_sweets + "grams");
					System.out.println("The total weight of the gift:" +total_weight);
					total_candies += candies;
					System.out.println("The total weight of gift is:");
					System.out.println(total_candies + total_sweets);
					break;
				}
			}catch(Exception e) {
				System.out.println("Your choice is out of range");
			}
		}
		sc.close();
	}



}
