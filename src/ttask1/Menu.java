package ttask1;

import ttask1.salads.Cobb;
import ttask1.salads.Olivier;
import ttask1.salads.Salad;
import ttask1.salads.Vinegret;
import ttask1.sorting.SortByClr;
import ttask1.sorting.SortByName;
import ttask1.sorting.SortByWgt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private Scanner sc;
	String inputSalad;
	String inputSort;
	static ArrayList <String>arr=new ArrayList<>();
	/**
	 * describe the main logic of program
	 */
	public Menu() throws StringNotDetected, IOException,FileIsEmpty,SaladNotFound,SortingNotFound {


		try {
			List<Salad> salad = new ArrayList<>();

			String Array[] = FileWriterReader.readFile().toArray(new String[]{});

				if (Array.length == 0) {
					throw new FileIsEmpty(("FIle is empty"));
				}



			for (int i = 0; i < Array.length; i++) {
				try {

					if (Array[i].toLowerCase().matches("cobb")) {
						salad.add(new Cobb());
					} else if (Array[i].toLowerCase().matches("olivier")) {
						salad.add(new Olivier());
					} else if (Array[i].toLowerCase().matches("vinegret"))
						salad.add(new Vinegret());
					else if (Array[i].toLowerCase().matches("[a-zA-Z]+")){
						FileWriterReader.write("Your file contains unreachable salad '"+Array[i].toUpperCase()+"' verify your file!");
						throw new SaladNotFound("Your file contains unreachable salad '"+Array[i].toUpperCase()+"' verify your file!");
					}
					else throw new SaladNotFound("Your file contains empty line");
				} catch (SaladNotFound ex){
					FileWriterReader.write("Program proceed execution with error: "+ex);
					System.out.println("Program proceed execution with error: "+ex);
				}
			}

			do {
				System.out.println("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) or type 'next' :");
				FileWriterReader.write("Please enter type of menu you want to see (sorted by Name, Weight, Calorie) or type 'next' :");
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
						FileWriterReader.write(salad.toString());
						break;
					case "weight":
						Collections.sort(salad, new SortByWgt());
						System.out.println(salad);
						FileWriterReader.write(salad.toString());
						break;
					default:
						try {
							if(!inputSort.matches("[a-zA-Z]+")){
								FileWriterReader.write("Failed");
								throw new StringNotDetected("Failed");}
							else if(inputSort.matches("next")){
								break;
							}
							else if(!inputSort.matches("calorie")|!inputSort.matches("weight")|!inputSort.matches("name")){
								throw new SortingNotFound("Failed");}


						} catch (StringNotDetected str){
							System.out.println("Type only letters!!!! Not digits! "+str);
							FileWriterReader.write("Type only letters!!!! Not digits!\n");

						}
						catch (SortingNotFound str){
							System.out.println("Sorting you entered doesn't exists "+str);
							FileWriterReader.write("Sorting you entered doesn't exists "+str);

						}




				}
			} while (!inputSort.matches("next"));




			try {

				do {
					System.out.println(
							"Please enter name of salad (Cobb,Olivier,Vinegret) or type 'next':");
					FileWriterReader.write("Please enter name of salad (Cobb,Olivier,Vinegret) or type 'next':");
					sc = new Scanner(System.in);
					inputSalad = sc.nextLine().toLowerCase();

					arr.add(inputSalad);

					switch (inputSalad) {

						case "cobb":
							try{
								for(int i=0;i<salad.size();i++)
									if(salad.get(i).getName().matches("Cobb")){

										String s="Cobb";
										System.out.println(salad.get(i).printComposition()+"Thank you for your choise. \n");
										FileWriterReader.write(salad.get(i).printComposition()+"Thank you for your choise. \n");}
									else if (!salad.equals("Cobb")){
										throw new SaladNotFound("Sorry, salad is currently not available");}}
							catch(SaladNotFound ex){
								System.out.println(ex);
							}
							break;
						case "olivier":
							try{
								for(int i=0;i<salad.size();i++)
									if(salad.get(i).getName().matches("Olivier")){

										String s="Olivier";
										System.out.println(salad.get(i).printComposition()+"Thank you for your choise. \n");
										FileWriterReader.write(salad.get(i).printComposition()+"Thank you for your choise. \n");}
									else if (!salad.equals("Olivier")){
										throw new SaladNotFound("Sorry, salad is currently not available");}}
							catch(SaladNotFound ex){
								System.out.println(ex);
							}
							break;
						case "vinegret":
							try{
								for(int i=0;i<salad.size();i++)
									if(salad.get(i).getName().matches("Vinegret")){

										String s="Vinegret";
										System.out.println(salad.get(i).printComposition()+"Thank you for your choise. \n");
										FileWriterReader.write(salad.get(i).printComposition()+"Thank you for your choise. \n");}
									else if (!salad.equals("Vinegret")){
										throw new SaladNotFound("Sorry, salad is currently not available");}}
							catch(SaladNotFound ex){
								System.out.println(ex);
							}
							break;
						default:
							try {
								if(inputSalad.matches("next")){
									break;
								}

								else	if(!inputSalad.matches("cobb")|!inputSalad.matches("olivier")|!inputSalad.matches("vinegret")){
									throw new StringNotDetected("Failed");}
							} catch (StringNotDetected str){
								System.out.println("Salad not found "+str);
								FileWriterReader.write("Salad not found\n");

							}

					}
				} while (!inputSalad.matches("next"));
				if(arr.contains("cobb")|arr.contains("olivier")|arr.contains("vinegret")){
					System.out.println("We pleased you are full! Come here again!");
				} else
				{System.out.println("Sorry for missing your favorite food, come here again later");}
				FileWriterReader.write("We pleased you are full! Come here again!");
			} catch (IndexOutOfBoundsException e){
				System.out.println("Arrayoutofbound"+e.getStackTrace());
			}
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException detected, please verify elements of salad's Arraylist"+e.getStackTrace());
		}

		catch (FileIsEmpty ex) {
			ex.printStackTrace();
			FileWriterReader.write("FIle is empty");
		}



	}

}
