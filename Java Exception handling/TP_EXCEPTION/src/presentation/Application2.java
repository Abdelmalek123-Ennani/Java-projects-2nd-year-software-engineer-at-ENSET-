package presentation;

import java.io.IOException;

public class Application2 {
    public static int diviser(int a,int b){
        int c=0;
        if(b==0) throw new ArithmeticException("Impossible de diviser par Zéro");
           c=  a/b;
        return c;
    }
    public static void main(String[] args) {
         try {
             System.out.println(diviser(3,0));
         }catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }

        System.out.println("Fin de programme");

    }
}
