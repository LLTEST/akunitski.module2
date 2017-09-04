package ttask1.salads;

import java.util.ArrayList;
import java.util.List;

public class Olivier extends Salad {


	public Olivier() {
		super("Olivier");
		List<Components> saladO = new ArrayList<>();
		saladO.add(new Components("Carrot", 200));
		saladO.add(new Components("Pepper", 250));
		this.salad = saladO;
	}

}
