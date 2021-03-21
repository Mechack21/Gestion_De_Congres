/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import Connexion.Connexion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MECHACK
 */
public class Intervenant {

    String IntervenantId, NomsIntervenant, TypeIntervenant;

    public String getIntervenantId() {
        return IntervenantId;
    }

    public void setIntervenantId(String IntervenantId) {
        this.IntervenantId = IntervenantId;
    }

    public String getNomsIntervenant() {
        return NomsIntervenant;
    }

    public void setNomsIntervenant(String NomsIntervenant) {
        this.NomsIntervenant = NomsIntervenant;
    }

    public String getTypeIntervenant() {
        return TypeIntervenant;
    }

    public void setTypeIntervenant(String TypeIntervenant) {
        this.TypeIntervenant = TypeIntervenant;
    }
    Connexion mct = new Connexion();

    public void Charger(JComboBox cmbx) {
        try {
            String req = "select Noms from Intervenants";
            cmbx.setModel(new DefaultComboBoxModel(new String[]{""}));
            mct.Selection(req);
            while (mct.reponse.next()) {
                cmbx.addItem(mct.reponse.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Erreur de CHARGEMENT du combobox : " + e.getMessage());
        }
    }

    public String IDinterve(String NomsInterv) {
        String id = "";
        try {
            String req = "select Id_Intervenant from Intervenants where Noms='" + NomsInterv + "'";
            mct.Selection(req);
            while (mct.reponse.next()) {
                id = mct.reponse.getString(1);
            }
            return id;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return id;
    }

    public void Remplir(JTable grille, String req) {
        try {

            int c = 0;
            mct.Selection(req);
            while (mct.reponse.next()) {
                c++;
            }

            Object data[][] = new Object[c][3];
            String titre[] = {"Code Intervenant", "Noms", "Type membre"};
            mct.Selection(req);
            int i = 0;
            while (mct.reponse.next()) {

                data[i][0] = mct.reponse.getString(1);
                data[i][1] = mct.reponse.getString(2);
                data[i][2] = mct.reponse.getString(3);
                i++;
            }

            grille.setModel(new DefaultTableModel(data, titre));
        } catch (Exception e) {
            System.out.println("Erreur du remplissage: " + e.getMessage());
        }
    }
    public void Ajouter() {
        try {
            String req = "insert into Intervenants (Id_Intervenant,Noms,TypeM)values('" + getIntervenantId()+ "','" + getNomsIntervenant()+ "','" + getTypeIntervenant()+ "')";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'AJOUT: " + e.getMessage());
        }
    }

    public void Modifier() {
        try {
            String req = "update Intervenants set Noms='" + getNomsIntervenant()+ "',TypeM='" + getTypeIntervenant()+ "'where Id_Intervenant='" + getIntervenantId()+ "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de MODIFICATION: " + e.getMessage());
        }
    }

    public void Supprimer() {
        try {
            String req = "delete from Intervenants where Id_Intervenant='" + getIntervenantId()+ "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de SUPPRESSION: " + e.getMessage());
        }
    }
}
