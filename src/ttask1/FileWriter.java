package ttask1;

import java.io.*;

public class FileWriter {
    static  String fileName = "C:\\Users\\chilavert\\workspace\\akunitski.module2\\src\\ttask1\\output.txt";
    static  String fileName2 = "C:\\Users\\chilavert\\workspace\\akunitski.module2\\src\\ttask1\\input.txt";
    public static void write(String text) {
        //Define a file

        File file = new File(fileName);

        try {

            if(!file.exists()){
                file.createNewFile();
            }

            //check that if the file does not exist then create it
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Write the text to the file
                out.print(text);
            } finally {
                //After that we must close the file
                //Otherwise, the file will not be written
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

static void readFile(){
        BufferedReader reader= null;
        try{
            reader = new BufferedReader(new FileReader(fileName2));
       String temp;
       while ((temp=reader.readLine())!=null){
                System.out.println(temp);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
}




