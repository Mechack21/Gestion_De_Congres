/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

/**
 *
 * @author MECHACK
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {

    private Connection meconnecter;
    private Statement Dbd;
    public ResultSet reponse;
    String chemin = "jdbc:sqlserver://PEDRO\\MUTOKASERVER:1433;databaseName=GesCong";
    String utilisateur = "sa";
    String motDePasse = "123456";

    public Connexion() {
        try {
            meconnecter = DriverManager.getConnection(chemin, utilisateur, motDePasse);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mise_a_jour(String requete) {
        try {
            Dbd = meconnecter.createStatement();
            int test = Dbd.executeUpdate(requete);
            if (test == 1) {
                System.out.println("Operation reussie");
            } else if (test == 0) {
                System.out.println("Echec operation");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Selection(String requete1) {
        try {
            Dbd = meconnecter.createStatement();
            reponse = Dbd.executeQuery(requete1);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
