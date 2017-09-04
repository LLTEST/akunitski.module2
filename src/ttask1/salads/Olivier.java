package ttask1.salads;

import java.util.ArrayList;
import java.util.List;

public class Olivier extends Salad {


	public Olivier() {
		super("Olivier");
		List<Components> salad = new ArrayList<>();
		salad.add(new Components("Carrot", 200));
		salad.add(new Components("Pepper", 250));
		this.salad = salad;
	}

}
