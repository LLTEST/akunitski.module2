package ttask1;

import java.util.ArrayList;
import java.util.List;

public class Cobb extends Salad {

	

	Cobb() {
		super("Cobb");
		List<Components> saladC = new ArrayList<>();
		saladC.add(new Components("Carrot", 100));
		saladC.add(new Components("Cucumber", 400));
		saladC.add(new Components("Tomato", 210));
		saladC.add(new Components("Oil", 10));
		this.salad = saladC;

	}

}
