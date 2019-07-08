package co.grandcircus.labnine;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Formatter;


public class LabNine {
	
	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
			
			System.out.println("Welcome to Dearbhla's Market! \n");
			
	
			
			Map<String, Double> items = new HashMap<>();
			
			items.put("Chicken stock", 1.79);
			items.put("Spaghetti noodles", 3.29);
			items.put("Yellow zucchini", 0.82);
			items.put("Paper towels", 2.31);
			items.put("Himalayan salt", 5.99);
			items.put("Sweet peppers", 3.02);
			items.put("Ground turkey", 8.67);
			items.put("Grape soda", 5.67);
			
			
			System.out.printf("%-20s %-20s\n", "Item", "Price");
			System.out.printf("%-20s\n", "====================================");
			
			for (Map.Entry<String, Double> me : items.entrySet()) {
				System.out.printf("%-20s %-20s", me.getKey(), ("$" + (me.getValue())));
				System.out.println("");	
				
			}
			System.out.println("\nWhat item would you like to order? ");
			String userEnter = scnr.nextLine();
			
			if (items.containsKey(userEnter)) {
				
			double cost = items.get(userEnter);
			System.out.println("\nAdding " + userEnter + " to cart at $" + cost + ".\n");
			
			
			} else {
				System.out.println("Sorry, that item does not exist. Please try again. ");
			} 
			
			System.out.println("Would you like to continue? y/n ");
			String userAns = scnr.next();
			
	}		System.out.println
}
	
	
