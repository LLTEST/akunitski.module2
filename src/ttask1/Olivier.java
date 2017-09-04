package ttask1;

import java.util.ArrayList;
import java.util.List;

public class Olivier extends Salad {


	Olivier() {
		super("Olivier");
		List<Components> saladO = new ArrayList<>();
		saladO.add(new Components("Carrot", 200));
		saladO.add(new Components("Pepper", 250));
		this.salad = saladO;
	}

}
