import java.io.*;

public class Application1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("file1.txt");
        File f2=new File("file2.txt");
        FileReader fr=new FileReader(f1);
        FileWriter fw=new FileWriter(f2,true);
        int c;
        while ((c=fr.read())!=-1){
           // fw.write(c);
            fw.append((char)c);
        }
        fr.close();
        fw.close();
    }
}
