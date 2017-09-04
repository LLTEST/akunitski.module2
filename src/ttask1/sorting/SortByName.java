package ttask1.sorting;

import ttask1.salads.Salad;

import java.util.Comparator;

public class SortByName implements Comparator<Salad> {
	/* 
	 * Method compare interfaces by Name
	 */
	public int compare(Salad o1, Salad o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
	

