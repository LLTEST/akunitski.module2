package ttask1;

import java.util.Comparator;

public class SortByWgt implements Comparator<Salad> {
	/* 
	 * Method compare Salads by Weight
	 */
	public int compare(Salad o1, Salad o2) {
		// TODO Auto-generated method stub
		return o1.foodWeight().compareTo(o2.foodWeight());
	}

}
