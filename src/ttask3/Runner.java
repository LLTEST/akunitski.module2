package ttask3;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Runner {

	private static String[] stream1s;

	public static void main(String args[]) throws IOException {
		
		try{
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String fileName = "C:/Users/chilavert/workspace/akunitski.module2/src/ttask3/data.txt";
		
		
		System.out.println("What is it!");
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream1s = stream.toArray(String[]::new);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(stream1s));
		
		
		List<String> lines = Arrays.asList("The first line", "The second line");
		Files.write(Paths.get("the-file-name.txt"), lines, Charset.forName("UTF-8"));
		
		
	
		
	}

}
