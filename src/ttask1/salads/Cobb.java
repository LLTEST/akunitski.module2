package ttask1.salads;

import java.util.ArrayList;
import java.util.List;

public class Cobb extends Salad {

	

	public Cobb() {
		super("Cobb");
		List<Components> salad = new ArrayList<>();
		salad.add(new Components("Carrot", 100));
		salad.add(new Components("Cucumber", 400));
		salad.add(new Components("Tomato", 210));
		salad.add(new Components("Oil", 10));
		this.salad = salad;

	}

}
