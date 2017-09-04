package ttask1.salads;

public class Components {
	private int calorie;
	private int weight;
	private String name;

	
	/**
	 * 
	 * Product Listing
	 */
	private enum VegList {
		
		Carrot, Oil, Cucumber, Pepper, Tomato
	}

	public Components(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	/**
	 * @return calorie of each type of product
	 */
	public int getCalor() {
		switch (VegList.valueOf(name)) {
		case Carrot:
			calorie = 33;
			break;
		case Oil:
			calorie = 43;
			break;
		case Cucumber:
			calorie = 22;
			break;
		case Pepper:
			calorie = 8;
			break;
		case Tomato:
			calorie = 11;
			break;
		default:
			calorie = 0;
			System.out.println("Calorie is missing");
		}
		return calorie;

	}

	/**
	 * @return weight of each product
	 */
	public int getWght() {
		return weight;
	}

	/**
	 * @return name of each product
	 */
	public String getName() {
		return name;
	}

}
