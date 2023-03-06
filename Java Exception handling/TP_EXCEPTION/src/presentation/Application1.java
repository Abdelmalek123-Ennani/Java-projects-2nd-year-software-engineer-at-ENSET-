package presentation;

import java.io.*;

public class Application1 {
    public static FileReader getFileReader(String fileName) throws IOException{
        File f1=new File(fileName);
        FileReader fr= new FileReader(f1);
        return fr;
    }
    public static void main(String[] args) {
           try {
               BufferedReader br=new BufferedReader(getFileReader("names.tx"));
           }catch (IOException e){
               e.printStackTrace();
           }
         System.out.println("Fin programme");
    }
}
