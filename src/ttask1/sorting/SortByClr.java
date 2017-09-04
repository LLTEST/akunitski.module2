package ttask1.sorting;

import ttask1.salads.Salad;

import java.util.Comparator;


public class SortByClr implements Comparator<Salad> {
	

	/* 
	 * Method compare interfaces by Calories
	 */
	public int compare(Salad o1, Salad o2) {
		
		return new Integer(o1.foodCalorie()).compareTo(new Integer(o2.foodCalorie()));

	}

}
