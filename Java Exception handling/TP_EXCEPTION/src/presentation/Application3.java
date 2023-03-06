package presentation;

import exceptions.SoldeInsuffisantException;
import metier.Compte;

public class Application3 {
    public static void main(String[] args) {
        Compte c1=new Compte();
        c1.setSolde(3000);
        try {
            c1.retirer(2000);
            c1.retirer(2000);
        }catch (SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Sole= "+c1.getSolde());
    }
}
