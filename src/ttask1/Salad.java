package ttask1;

import java.util.ArrayList;
import java.util.List;

public class Salad implements WeightName {

	String name;
	List<Components> salad;

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
	public Integer foodCalor() {
		int j = 0;
		for (Components c : salad) {
			j += Math.round((double) c.getWght() * c.getCalor()/100);
		}
		Integer f = new Integer(j);
		return f;
	}

	/* (non-Javadoc)
	 * @see task4.WeightName#foodWeight()
	 */
	
	
	public Integer foodWeight() throws ArithmeticException {
		
		int h = 0;
		
		for (Components c : salad) {
			h += c.getWght();
		}
		Integer r = new Integer(h);

		return r;
		
		
		
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
		return "Salad: " + this.getName() + ", calorie: " + this.foodCalor() + " Kcal, weight: " + this.foodWeight()
				+ " g." + "\n";
	}

	/**
	 * print the result of namecomp() method to console 
	 */
	public String toString1() {
		return "Composition of salad '" + this.getName() + "': " + this.namecomp();
	}

}