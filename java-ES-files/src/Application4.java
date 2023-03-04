import java.io.*;

public class Application4 {
    public static void main(String[] args) throws IOException {
        File f1=new File("products.dat");
        FileOutputStream fos=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Product p1=new Product();
        p1.setName("Mac");
        p1.setPrice(12000);
        oos.writeObject(p1);
        oos.close();

    }
}
