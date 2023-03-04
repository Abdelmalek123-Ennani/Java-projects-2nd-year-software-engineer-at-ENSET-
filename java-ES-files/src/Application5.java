import java.io.*;

public class Application5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f1=new File("products.dat");
        FileInputStream fis=new FileInputStream(f1);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Product p=(Product) ois.readObject();
        System.out.println(p.getName()+" "+p.getPrice());
        ois.close();
    }
}
