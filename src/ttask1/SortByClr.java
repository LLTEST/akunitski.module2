package ttask1;

import java.util.Comparator;


public class SortByClr implements Comparator<Salad> {
	

	/* 
	 * Method compare Salads by Calories
	 */
	public int compare(Salad o1, Salad o2) {
		
		return o1.foodCalor().compareTo(o2.foodCalor());

	}

}
