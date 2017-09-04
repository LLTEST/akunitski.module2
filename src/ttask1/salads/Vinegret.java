package ttask1.salads;

import java.util.ArrayList;
import java.util.List;

public class Vinegret extends Salad {

	public Vinegret() {
		super("Vinegret");
		List<Components> salad = new ArrayList<>();
		salad.add(new Components("Tomato", 60));
		salad.add(new Components("Carrot", 500));
		salad.add(new Components("Pepper", 120));
		this.salad = salad;
	}

}
