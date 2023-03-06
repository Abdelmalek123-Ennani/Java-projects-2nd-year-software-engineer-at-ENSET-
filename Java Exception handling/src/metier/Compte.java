package metier;

import exceptions.SoldeInsuffisantException;

public class Compte {
    private long id;
    private float solde;

    public Compte() {
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float getSolde() {
        return solde;
    }

    public long getId() {
        return id;
    }
    public void retirer(float motant)throws SoldeInsuffisantException{
            if(motant>solde) throw  new SoldeInsuffisantException("Solde est insuffisant");
          solde-=motant;
    }
}
