package ttask3;
import java.io.*;
import java.util.Scanner;

public class Runner2 {



    public static void main(String args[]) throws IOException {



        File file = new File("newFile.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Sad story");
            output.println("213");
            output.close();
        } catch (IOException ex){
            System.out.println(ex);
        }

        try{
            Scanner input= new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.printf(name +" "+ age);
        } catch (FileNotFoundException ex){
            System.out.println("Bad things"+ex);
        }

    }
}