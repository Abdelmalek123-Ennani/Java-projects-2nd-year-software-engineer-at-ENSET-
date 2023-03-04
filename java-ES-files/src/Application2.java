import java.io.*;

public class Application2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("enset1.jpg");
        File f2=new File("enset2.jpg");
        FileInputStream fis=new FileInputStream(f1);
        FileOutputStream fos=new FileOutputStream(f2);
       int c;
       while((c=fis.read())!=-1){
           fos.write(c);
       }
       fis.close();
       fos.close();
    }
}
