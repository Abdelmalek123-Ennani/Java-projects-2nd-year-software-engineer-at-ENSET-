package services.commande;

import project.tasks_management.entities.Commande;
import project.tasks_management.entities.Produit;

import java.sql.SQLException;
import java.util.List;

public interface commandeService {
    void addCommande(Commande c) throws SQLException;
    void deleteCommande(Commande c) throws SQLException;
    void updateCommande(Commande c) throws SQLException;
    List<Commande> getCommandes() throws SQLException;
    List<Commande> getCommandesByProduit(Produit p) throws SQLException;
}
