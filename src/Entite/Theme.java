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
public class Theme {

    String ThemeId, IntituleTheme;

    public String getThemeId() {
        return ThemeId;
    }

    public void setThemeId(String ThemeId) {
        this.ThemeId = ThemeId;
    }

    public String getIntituleTheme() {
        return IntituleTheme;
    }

    public void setIntituleTheme(String IntituleTheme) {
        this.IntituleTheme = IntituleTheme;
    }
    Connexion mct = new Connexion();

    public void Charger(JComboBox cmbx) {
        try {
            String req = "select LibeleTheme from Themes";
            cmbx.setModel(new DefaultComboBoxModel(new String[]{""}));
            mct.Selection(req);
            while (mct.reponse.next()) {
                cmbx.addItem(mct.reponse.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Erreur de CHARGEMENT du combobox : " + e.getMessage());
        }
    }

    public String IDThem(String LibThem) {
        String id = "";
        try {
            String req = "select Id_Theme from Themes where LibeleTheme='" + LibThem + "'";
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

            Object data[][] = new Object[c][2];
            String titre[] = {"Code Theme", "Intitulé theme"};
            mct.Selection(req);
            int i = 0;
            while (mct.reponse.next()) {

                data[i][0] = mct.reponse.getString(1);
                data[i][1] = mct.reponse.getString(2);
                i++;
            }

            grille.setModel(new DefaultTableModel(data, titre));
        } catch (Exception e) {
            System.out.println("Erreur du remplissage: " + e.getMessage());
        }
    }

    public void Ajouter() {
        try {
            String req = "insert into Themes (Id_Theme,LibeleTheme)values('" + getThemeId() + "','" + getIntituleTheme() + "')";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'AJOUT: " + e.getMessage());
        }
    }

    public void Modifier() {
        try {
            String req = "update Themes set LibeleTheme='" + getIntituleTheme() + "'where Id_Theme='" + getThemeId() + "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de MODIFICATION: " + e.getMessage());
        }
    }

    public void Supprimer() {
        try {
            String req = "delete from  Themes where Id_Theme='" + getThemeId() + "'";
            mct.mise_a_jour(req);
        } catch (Exception e) {
            System.out.println("Erreur de SUPPRESSION: " + e.getMessage());
        }
    }

}
