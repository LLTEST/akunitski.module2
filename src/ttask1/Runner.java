package ttask1;


import java.io.IOException;

public class Runner {

	/**
	 * Start the execution of code
	 */
	public static void main(String[] args) throws StringNotDetected, IOException,FileIsEmpty,SaladNotFound,SortingNotFound {

		FileWriterReader.create();
		new Menu();


	}

}
