package ttask1;

import ttask1.salads.Cobb;
import ttask1.salads.Olivier;
import ttask1.salads.Salad;
import ttask1.salads.Vinegret;
import ttask1.sorting.SortByClr;
import ttask1.sorting.SortByName;
import ttask1.sorting.SortByWgt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private Scanner sc;

	/**
	 * describe the main logic of program
	 */
	public Menu() {
try{
		List<Salad> salad = new ArrayList<>();
		salad.add(new Cobb());
		salad.add(new Olivier());
		salad.add(new Vinegret());

		String f;
		do {
			System.out.println("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) :");
			sc = new Scanner(System.in);
			f = sc.nextLine().toLowerCase();

			switch (f) {
			case "name":
				Collections.sort(salad, new SortByName());
				System.out.println(salad);
				break;
			case "calorie":
				Collections.sort(salad, new SortByClr());
				System.out.println(salad);
				break;
			case "weight":
				Collections.sort(salad, new SortByWgt());
				System.out.println(salad);
				break;
			default:
				System.out.println("Please verify what you entered");
				
			

			}
		} while (!f.isEmpty());
		System.out.println("We pleased you are full! Come here again!");

		String f1 = "";
		
		try {
		
		do {
			System.out.println(
					"Please enter name of salad (Cobb,Olivier,Vinegret) or do not type anything and tap enter:");
			sc = new Scanner(System.in);
			f1 = sc.nextLine().toLowerCase();

			switch (f1) {
			case "cobb":
				System.out.println(salad.get(0).toString1());
				System.out.println("Thank you for your choise. \n");
				break;
			case "olivier":
				System.out.println(salad.get(1).toString1());
				System.out.println("Thank you for your choise. \n");
				break;
			case "vinegret":
				System.out.println(salad.get(22).toString1());
				System.out.println("Thank you for your choise. \n");

			default:
				System.out.println("Please verify what you entered");

			}
		} while (!f1.isEmpty());
		System.out.println("We pleased you are full! Come here again!");
		} catch (IndexOutOfBoundsException e){
			System.out.println("arrayoutofbound");
			throw e;
		}
}
catch (NullPointerException e) {
	System.out.println("asfasf");
}
		
	}

}
