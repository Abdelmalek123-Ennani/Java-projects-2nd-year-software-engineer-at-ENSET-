import java.io.*;

public class Application3 {
    public static void main(String[] args) throws IOException {
        File f1=new File("file1.txt");
        File f2=new File("file2.txt");

        FileReader fr=new FileReader(f1);
        FileWriter fw=new FileWriter(f2);

        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);

        String ligne=null;
        while ((ligne=br.readLine())!=null){
            bw.write(ligne);
            bw.newLine();
            //bw.flush();
        }
        br.close();
        bw.close();
    }
}
