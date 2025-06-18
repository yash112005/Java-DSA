import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        try{
            // create file
            File f = new File("file.txt");
            if(f.createNewFile()){
                System.out.println("file created : " + f.getName());
            }
            else{
                System.out.println("file already exists");
            }

            // writing a file
            FileWriter writer = new FileWriter("file.txt");
            writer.write("hello welcome to file");
            writer.close();
            System.out.println("successfully wrote the file");

            // Read a file
            File file = new File("file.txt");
            Scanner sc = new Scanner(file);
            if(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();

            //delete a file
            File files = new File("file.txt");
            if(files.delete()){
                System.out.println("file deleted : "+  files.getName());
            }
            else{
                System.out.println("failed to delete file");
            }
        } catch (IOException e) {
            System.out.println("an error occured");
        }
    }







    }


