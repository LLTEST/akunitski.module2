package ttask1;

import ttask1.salads.Cobb;
import ttask1.salads.Olivier;
import ttask1.salads.Salad;
import ttask1.salads.Vinegret;
import ttask1.sorting.SortByClr;
import ttask1.sorting.SortByName;
import ttask1.sorting.SortByWgt;

import java.io.File;
import java.io.FileWriter;
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

		String fileName = "C:\\Users\\Aliaksandr_Kunitski\\IdeaProjects\\akunitski.module2\\src\\ttask1\\output.txt";
		File file = new File(fileName);
		if(!file.exists()){
			file.createNewFile();
		}

		//check that if the file does not exist then create itasd
		FileWriter out = new FileWriter(file);
		try{
			List<Salad> salad = new ArrayList<>();
			salad.add(new Cobb());
			salad.add(new Olivier());
			salad.add(new Vinegret());

			String inputSort;
			do {
				System.out.println("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) :");
				out.append("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) :\\n");
				sc = new Scanner(System.in);
				inputSort = sc.nextLine().toLowerCase();
				try {
					if(!inputSort.matches("[a-zA-Z]+")){
					throw new StringNotDetected("Failed");}
				} catch (StringNotDetected str){
					System.out.println("Type only letters!!!! Not digits!");

						inputSort = sc.nextLine().toLowerCase();

				}



				switch (inputSort) {
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
						out.append("Please verify what you entered");



				}
			} while (!inputSort.isEmpty());
			System.out.println("We pleased you are full! Come here again!");
			out.append("We pleased you are full! Come here again!");



			try {

				do {
					System.out.println(
							"Please enter name of salad (Cobb,Olivier,Vinegret) or do not type anything and tap enter:");
					out.append("Please enter name of salad (Cobb,Olivier,Vinegret) or do not type anything and tap enter:");
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
							out.append("Please verify what you entered");

					}
				} while (!inputSalad.isEmpty());
				System.out.println("We pleased you are full! Come here again!");
				out.append("We pleased you are full! Come here again!");
			} catch (IndexOutOfBoundsException e){
				System.out.println("Arrayoutofbound"+e.getStackTrace());
			}
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException detected, please verify elements of salad's Arraylist"+e.getStackTrace());
		}
out.close();
	}

}
