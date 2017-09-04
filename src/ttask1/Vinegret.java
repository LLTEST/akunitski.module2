package ttask1;

import java.util.ArrayList;
import java.util.List;

public class Vinegret extends Salad {

	Vinegret() {
		super("Vinegret");
		List<Components> saladV = new ArrayList<>();
		saladV.add(new Components("Tomato", 60));
		saladV.add(new Components("Carrot", 500));
		saladV.add(new Components("Pepper", 120));
		this.salad = saladV;
	}

}
