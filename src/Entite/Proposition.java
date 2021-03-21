/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import Connexion.Connexion;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MECHACK
 */
public class Proposition {

    String IdProposition, IdIntervenant, IdTheme, ResumeP, Date;

    public String getIdProposition() {
        return IdProposition;
    }

    public void setIdProposition(String IdProposition) {
        this.IdProposition = IdProposition;
    }

    public String getIdIntervenant() {
        return IdIntervenant;
    }

    public void setIdIntervenant(String IdIntervenant) {
        this.IdIntervenant = IdIntervenant;
    }

    public String getIdTheme() {
        return IdTheme;
    }

    public void setIdTheme(String IdTheme) {
        this.IdTheme = IdTheme;
    }

    public String getResumeP() {
        return ResumeP;
    }

    public void setResumeP(String ResumeP) {
        this.ResumeP = ResumeP;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    Connexion mct = new Connexion();

    public void Remplir(JTable grille, String req) {
        try {

            int c = 0;
            mct.Selection(req);
            while (mct.reponse.next()) {
                c++;
            }

            Object data[][] = new Object[c][5];
            String titre[] = {"Code Proposition", "Intervenant", "Theme abordé", "Résumé", "Date",};
            mct.Selection(req);
            int i = 0;
            while (mct.reponse.next()) {

                data[i][0] = mct.reponse.getString(1);
                data[i][1] = mct.reponse.getString(2);
                data[i][2] = mct.reponse.getString(3);
                data[i][3] = mct.reponse.getString(4);
                data[i][4] = mct.reponse.getString(5);
                i++;
            }

            grille.setModel(new DefaultTableModel(data, titre));
        } catch (Exception e) {
            System.out.println("Erreur du remplissage: " + e.getMessage());
        }
    }

    public void Ajouter() {
        try {
            String req = "insert into Propositions (Id_Proposition,Id_Intervenant,Id_Theme,Resume,Date)values('" + getIdProposition()+ "','" + getIdIntervenant()+ "','" + getIdTheme()+ "','" + getResumeP()+ "','" + getDate()+ "')";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'AJOUT: " + e.getMessage());
        }
    }

    public void Modifier() {
        try {
            String req = "update Propositions set Id_Intervenant='" + getIdIntervenant()+ "',Id_Theme='" + getIdTheme()+ "',Resume='" + getResumeP()+ "',Date='" + getDate()+ "' where Id_Proposition='" + getIdProposition()+ "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de MODIFICATION: " + e.getMessage());
        }
    }

    public void Supprimer() {
        try {
            String req = "delete from Propositions where Id_Proposition='" + getIdProposition()+ "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de SUPPRESSION: " + e.getMessage());
        }
    }
}
