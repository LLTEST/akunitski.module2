package ttask1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriterReader {
    private static String filename2="\\src\\ttask1\\input.txt";
    private static String s2="\\";
    private static String absoluteFilePath2  = System.getProperty("user.dir") + s2 + filename2;
    private static String filename = "\\src\\ttask1\\output2.txt";
    private static String s="\\";
    private static  String absoluteFilePath = System.getProperty("user.dir") + s + filename;

    private static   File file=new File(absoluteFilePath);


    public static void create() {
        //Define a file



        try {

            if(file.exists()){
                file.delete();
                file.createNewFile();
            }

            //check that if the file does not exist then create itasd

        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String x){
        try {
        FileWriter out = new FileWriter(file, true);
        BufferedWriter bufferWriter = new BufferedWriter(out);

           try {
               bufferWriter.append('\n');
               bufferWriter.append(x);
           } finally {
               bufferWriter.close();
           }
        }
        catch (IOException io){
            io.printStackTrace();
        }


        }


    public static List<String> readFile() {
        BufferedReader reader = null;
        String temp;
        ArrayList<String> lines=new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader(absoluteFilePath2));
            while ((temp = reader.readLine()) != null) {
                lines.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return lines;
    }
    }











