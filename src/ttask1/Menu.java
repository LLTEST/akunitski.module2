package ttask1;

import ttask1.salads.Cobb;
import ttask1.salads.Olivier;
import ttask1.salads.Salad;
import ttask1.salads.Vinegret;
import ttask1.sorting.SortByClr;
import ttask1.sorting.SortByName;
import ttask1.sorting.SortByWgt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private Scanner sc;
	String inputSalad;
	/**
	 * describe the main logic of program
	 */
	public Menu() throws StringNotDetected, IOException {


		try {
			List<Salad> salad = new ArrayList<>();

			String Array[] = FileWriterReader.readFile().toArray(new String[]{});
			try {
				if (Array.length == 0) {
					throw new StringNotDetected(("FIle is empty"));
				}
			} catch (StringNotDetected ex) {
				ex.printStackTrace();

			}


	for (int i = 0; i < Array.length; i++) {
		try {

		 if (Array[i].matches("Cobb")) {
			salad.add(new Cobb());
		} else if (Array[i].matches("Olivier")) {
			salad.add(new Olivier());
		} else if (Array[i].matches("Vinegret"))
			salad.add(new Vinegret());
		else if (Array[i].matches("[a-zA-Z]+")){

				throw new StringNotDetected("Your file contains unreachable salad "+Array[i]);
			}
		else throw new StringNotDetected("Your file contains empty line");
		} catch (StringNotDetected ex){

			System.out.println("Program proceed execution with error: "+ex);
		}
	}



			String inputSort;
			do {
				System.out.println("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) :");
				FileWriterReader.write("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) :\n");
				sc = new Scanner(System.in);
				inputSort = sc.nextLine().toLowerCase();




				switch (inputSort) {
					case "name":
						Collections.sort(salad, new SortByName());
						System.out.println(salad);
						FileWriterReader.write(salad.toString());
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
						try {
							if(!inputSort.matches("[a-zA-Z]+")){
								throw new StringNotDetected("Failed");}
						} catch (StringNotDetected str){
							System.out.println("Type only letters!!!! Not digits! "+str);
							FileWriterReader.write("Type only letters!!!! Not digits!\n");

						}




				}
			} while (!inputSort.isEmpty());
			System.out.println("We pleased you are full! Come here again!");




			try {

				do {
					System.out.println(
							"Please enter name of salad (Cobb,Olivier,Vinegret) or do not type anything and tap enter:");
					sc = new Scanner(System.in);
					inputSalad = sc.nextLine().toLowerCase();

					switch (inputSalad) {
						case "cobb":
							System.out.println(salad.get(0).printComposition());
							System.out.println("Thank you for your choise. \n");
							break;
						case "olivier":
							System.out.println(salad.get(1).printComposition());
							System.out.println("Thank you for your choise. \n");
							break;
						case "vinegret":
							System.out.println(salad.get(2).printComposition());
							System.out.println("Thank you for your choise. \n");

						default:
							System.out.println("Please verify what you entered");

					}
				} while (!inputSalad.isEmpty());
				System.out.println("We pleased you are full! Come here again!");
			} catch (IndexOutOfBoundsException e){
				System.out.println("Arrayoutofbound"+e.getStackTrace());
			}
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException detected, please verify elements of salad's Arraylist"+e.getStackTrace());
		}
	}

}
