package ttask1.salads;

import ttask1.interfaces.WeightName;

import java.util.ArrayList;
import java.util.List;

public class Salad implements WeightName {




	String name;
	public List<Components> salad;

	/** come from different salads
	 * @param saladOut
	 * @param name
	 */
	public Salad(String name) {
		salad=new ArrayList<>();
		this.name = name;
	}



	public String getName() {
		return name;
	}

	
	/* (non-Javadoc)
	 * @see task4.WeightName#foodCalor()
	 */

	public int foodCalorie() {

			int j = 0;
		try {
			for (Components c : salad) {
				j += Math.round((double) c.getWght() * c.getCalor() / 100);
			}
		}catch (ArithmeticException e){
         System.out.println("ArithmeticException deteceted");
		}

		return j;
	}


	/* (non-Javadoc)
	 * @see task4.WeightName#foodWeight()
	 */


	public int foodWeight()  {

		int h = 0;

		for (Components c : salad) {
			h += c.getWght();
		}
		return h;



	}


	/**
	 * @return list of products in String format
	 */
	public String namecomp() {
		String h = "";
		for (Components c : salad) {
			h += c.getName() + ", ";
		}
		return h;
	}

	@Override
	public String toString() {

		return "Salad: " + this.getName() + ", calorie: " + this.foodCalorie() + " Kcal, weight: " + this.foodWeight()
				+ " g." + "\n";

	}

	/**
	 * print the result of namecomp() method to console
	 */
	public String printComposition() {
		return "Composition of salad '" + this.getName() + "': " + this.namecomp();
	}

}